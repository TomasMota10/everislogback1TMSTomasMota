package com.everis.everislogback1TMSTomasMota;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	/** Looger **/
	final static Logger LOGGER= LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	LOGGER.info("Inicio del método");
    	
        for(int i=0;i<=600;i++) {
        	LOGGER.debug("Interacción con el números:{}",i);
        }
        
        LOGGER.info("Fin del método");
    }
}
