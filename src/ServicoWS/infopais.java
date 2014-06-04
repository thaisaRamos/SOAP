package ServicoWS;





	import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

	import org.oorsprong.www.websamples_countryinfo.CountryInfoServiceLocator;
	import org.oorsprong.www.websamples_countryinfo.CountryInfoServiceSoapBindingStub;




import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.ArrayList;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;




@WebService(serviceName ="InfoPais" , name = "info")
public class infopais {
	
	public infopais(){
		InfomacaoCidade("BRL");
	}
	ArrayList<String> infoPais;


	
	   
	    @WebMethod(operationName = "InformacaoCidade")
		public ArrayList<String> InfomacaoCidade(@WebParam(name="name")String codPais)  {
			
			try{
		CountryInfoServiceSoapBindingStub service = (CountryInfoServiceSoapBindingStub) new CountryInfoServiceLocator().getCountryInfoServiceSoap(new URL("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso"));
		
		String nomePais;
		nomePais = service.countryName(codPais);
	//	System.out.println("Pais: " + nomePais);
	//	System.out.println("abrevia�ao" + codPais);
		
		String capital;
		capital = service.capitalCity(codPais);
	//	System.out.println("Capital :"+ capital);
		
		String moeda;
		moeda = service.currencyName(codPais);
	//	System.out.println("Moeda: "+ moeda);
		
		
		String ddi;
		ddi = service.countryIntPhoneCode(codPais);
	//	System.out.println("DDI: " + ddi);
		
		String bandeira;
		bandeira =service.countryFlag(codPais);
	//	System.out.println("A bandeira �: "+ bandeira);
		
		infoPais = new ArrayList<String>();
		infoPais.add(nomePais);
		infoPais.add(codPais);
		infoPais.add(capital);
		infoPais.add(moeda);
		infoPais.add(ddi);
		infoPais.add(bandeira);

		
			}
			catch (RemoteException e) {
				// TODO: handle exception
			}
			catch (MalformedURLException e) {
				// TODO: handle exception
			}
			catch (ServiceException e) {
				// TODO: handle exception
			}

			return infoPais;
		}
	


	public boolean enviarInfoPaisParaEmail(String codPais,String msg,String emailRemetente)  {
		try {

			HtmlEmail email = new HtmlEmail();
			
			ArrayList<String> infopais = new ArrayList<String>();
			infopais = InfomacaoCidade(codPais);
			
			//System.out.println(infopais.get(0));
			//System.out.println(infopais.get(1));
		//	System.out.println(infopais.get(2));
			//System.out.println(infopais.get(3));
			//System.out.println(infopais.get(4));
			//System.out.println(infopais.get(5));
		//	System.out.println(infopais.get(6));
			
			
			
			// adiciona uma imagem ao corpo da mensagem e retorna seu id
			
			
			URL url2;
			url2 = new URL(infopais.get(5));
			String cid2 = email.embed(url2, "bandeira");

			

			// configura a mensagem para o formato HTML
			email.setHtmlMsg("<html><img src=\"cid:" + cid2
					+ "\"> <body><p> Informa�oes </p>"
					+ "<p>Pais: " + infopais.get(0) + "</p> "+       
					"<p> Abrevia��o: " + infopais.get(1) + " </p> " + 
					"<p> Capital: " + infopais.get(2) + "</p>" +
					"<p> Moeda " + infopais.get(3) + "</p>" + 
					"<p> DDI: " + infopais.get(4) + "</p>" +
					"<p> Outras informa�oes: " + msg + "</p></body> </html>");

			// configure uma mensagem alternativa caso o servidor n�o suporte
			// HTML
			
		//	email.setHtmlMsg("<html> ashiu</html>");
			email.setTextMsg("Seu servidor de e-mail n�o suporta mensagem HTML");

			email.setHostName("smtp.gmail.com"); // o servidor SMTP para envio
													// do
													// e-mail
			email.addTo(emailRemetente); // destinat�rio
			email.setFrom("informacaopais@gmail.com"); // remetente
			email.setSubject("InfoPais"); // assunto do e-mail
			// email.setMsg("A cota��o do dia �: "); //conteudo do e-mail
			email.setAuthentication("informacaopais", "trabalhopd");
			email.setSmtpPort(465);
			email.setSSL(true);
			email.setTLS(true);
			// envia email
			email.send();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	
	
	

}
