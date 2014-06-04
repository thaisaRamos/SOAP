package ServicoWS;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.rpc.Call;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.encoding.TypeMappingRegistry;
import javax.xml.rpc.handler.HandlerRegistry;

import org.apache.log4j.chainsaw.Main;
import org.oorsprong.www.websamples_countryinfo.CountryInfoServiceLocator;
import org.oorsprong.www.websamples_countryinfo.CountryInfoServiceSoapBindingStub;

import br.com.server.InfoAeroporto;
import br.com.server.InfoAeroportoPortBindingStub;
import br.com.server.InfoAreoportoServer;
import br.com.server.InfoAreoportoServerLocator;
import br.com.server.PaisBean;

public class Cliente {
	
	String cod;
	infopais info;
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.clienteinfo();
	}
	
	public void clienteinfo(){
		System.out.println("Digite o codigo do pais: ");
		Scanner scanner = new Scanner(System.in);
		cod = scanner.nextLine();
		info = new infopais();
		
		
		ArrayList list;
		list =info.InfomacaoCidade(cod);
		
		System.out.println("Pais: " +list.get(0));
		String nomePais = list.get(0).toString();
		PaisBean p = new PaisBean();
		p = teste(list.get(0).toString());
		//System.out.println("GMT: " + p.getGmt());
		System.out.println("Abreviacao: " + list.get(1));
		System.out.println("Capital: " + list.get(2));
		System.out.println("Moeda: " +list.get(3));
		System.out.println("DDI" + list.get(4));
		
		
		
		System.out.println("Deseja envia para o email? S|N");
		String envia = scanner.nextLine();
		if (envia.equals("S")){
			System.out.println("Digite seu email");
			String email = scanner.nextLine();
			
			System.out.println("Digite uma mensagem: ");
			String msg = scanner.nextLine();
			
			info.enviarInfoPaisParaEmail(cod, msg, email);
			System.out.println("email enviado");
		
		}
		else {
			System.exit(0);
		}
		
		
		
	}

	
	public PaisBean teste(String pais) {
	
				InfoAeroportoPortBindingStub service;
				try {
					service = (InfoAeroportoPortBindingStub) new InfoAreoportoServerLocator().getInfoAeroportoPort(new URL("http://10.9.98.241:8080/InfoAeroportos2/InfoAeroporto"));
				
		
				PaisBean pais2 = new PaisBean();
				
				pais2 = service.getPais(pais);
				
				return pais2;
				
				}catch (RemoteException e) {
					// TODO: handle exception
				} 
				catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
				
		
	}
}