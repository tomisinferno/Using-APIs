package info.hccis.starting;

import info.hccis.starting.bo.APIProcessor;
import info.hccis.util.CisUtility;

/**
 *
 * @author tomia
 */
public class Controller {

    public static void main(String[] args) {
        String name = CisUtility.getInputString("What is your name?");
        APIProcessor.callApi(name);
    }
    
}
