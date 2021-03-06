
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "PatchMetadataInvalidFault", targetNamespace = "urn:vim25")
public class PatchMetadataInvalidFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PatchMetadataInvalid faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public PatchMetadataInvalidFaultMsg(String message, PatchMetadataInvalid faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public PatchMetadataInvalidFaultMsg(String message, PatchMetadataInvalid faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.PatchMetadataInvalid
     */
    public PatchMetadataInvalid getFaultInfo() {
        return faultInfo;
    }

}
