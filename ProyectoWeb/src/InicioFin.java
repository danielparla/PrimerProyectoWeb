

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Esto es un CallBack, comenzara a funcionar sin necesidad de llamarlo y acabara cuando se cierre el programa
 * 
 * Application Lifecycle Listener implementation class InicioFin
 *
 */
@WebListener
public class InicioFin implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public InicioFin() {
        // TODO Auto-generated constructor stub
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    	System.out.println("PROGRAMA DESTRUIDO");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("PROGRAMA INICIADO");
    }
	
}
