
package Webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Webservice", targetNamespace = "http://Webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Webservice {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://Webservice/", className = "Webservice.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://Webservice/", className = "Webservice.LoginResponse")
    @Action(input = "http://Webservice/Webservice/loginRequest", output = "http://Webservice/Webservice/loginResponse")
    public boolean login(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "benutzerOrgaEinheitAendern", targetNamespace = "http://Webservice/", className = "Webservice.BenutzerOrgaEinheitAendern")
    @ResponseWrapper(localName = "benutzerOrgaEinheitAendernResponse", targetNamespace = "http://Webservice/", className = "Webservice.BenutzerOrgaEinheitAendernResponse")
    @Action(input = "http://Webservice/Webservice/benutzerOrgaEinheitAendernRequest", output = "http://Webservice/Webservice/benutzerOrgaEinheitAendernResponse")
    public boolean benutzerOrgaEinheitAendern(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gibtEsOrgaEinheitSchon", targetNamespace = "http://Webservice/", className = "Webservice.GibtEsOrgaEinheitSchon")
    @ResponseWrapper(localName = "gibtEsOrgaEinheitSchonResponse", targetNamespace = "http://Webservice/", className = "Webservice.GibtEsOrgaEinheitSchonResponse")
    @Action(input = "http://Webservice/Webservice/gibtEsOrgaEinheitSchonRequest", output = "http://Webservice/Webservice/gibtEsOrgaEinheitSchonResponse")
    public boolean gibtEsOrgaEinheitSchon(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "stricheln", targetNamespace = "http://Webservice/", className = "Webservice.Stricheln")
    @ResponseWrapper(localName = "strichelnResponse", targetNamespace = "http://Webservice/", className = "Webservice.StrichelnResponse")
    @Action(input = "http://Webservice/Webservice/strichelnRequest", output = "http://Webservice/Webservice/strichelnResponse")
    public boolean stricheln(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        boolean arg4);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<Webservice.ComBenutzer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBenutzer", targetNamespace = "http://Webservice/", className = "Webservice.GetBenutzer")
    @ResponseWrapper(localName = "getBenutzerResponse", targetNamespace = "http://Webservice/", className = "Webservice.GetBenutzerResponse")
    @Action(input = "http://Webservice/Webservice/getBenutzerRequest", output = "http://Webservice/Webservice/getBenutzerResponse")
    public List<ComBenutzer> getBenutzer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<Webservice.ComStatistik>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStatistik", targetNamespace = "http://Webservice/", className = "Webservice.GetStatistik")
    @ResponseWrapper(localName = "getStatistikResponse", targetNamespace = "http://Webservice/", className = "Webservice.GetStatistikResponse")
    @Action(input = "http://Webservice/Webservice/getStatistikRequest", output = "http://Webservice/Webservice/getStatistikResponse")
    public List<ComStatistik> getStatistik(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "anzeige", targetNamespace = "http://Webservice/", className = "Webservice.Anzeige")
    @ResponseWrapper(localName = "anzeigeResponse", targetNamespace = "http://Webservice/", className = "Webservice.AnzeigeResponse")
    @Action(input = "http://Webservice/Webservice/anzeigeRequest", output = "http://Webservice/Webservice/anzeigeResponse")
    public List<Integer> anzeige(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "benutzerErstellen", targetNamespace = "http://Webservice/", className = "Webservice.BenutzerErstellen")
    @ResponseWrapper(localName = "benutzerErstellenResponse", targetNamespace = "http://Webservice/", className = "Webservice.BenutzerErstellenResponse")
    @Action(input = "http://Webservice/Webservice/benutzerErstellenRequest", output = "http://Webservice/Webservice/benutzerErstellenResponse")
    public boolean benutzerErstellen(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "benutzerLoeschen", targetNamespace = "http://Webservice/", className = "Webservice.BenutzerLoeschen")
    @ResponseWrapper(localName = "benutzerLoeschenResponse", targetNamespace = "http://Webservice/", className = "Webservice.BenutzerLoeschenResponse")
    @Action(input = "http://Webservice/Webservice/benutzerLoeschenRequest", output = "http://Webservice/Webservice/benutzerLoeschenResponse")
    public boolean benutzerLoeschen(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "benutzernameAendern", targetNamespace = "http://Webservice/", className = "Webservice.BenutzernameAendern")
    @ResponseWrapper(localName = "benutzernameAendernResponse", targetNamespace = "http://Webservice/", className = "Webservice.BenutzernameAendernResponse")
    @Action(input = "http://Webservice/Webservice/benutzernameAendernRequest", output = "http://Webservice/Webservice/benutzernameAendernResponse")
    public boolean benutzernameAendern(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gibtesBenutzerschon", targetNamespace = "http://Webservice/", className = "Webservice.GibtesBenutzerschon")
    @ResponseWrapper(localName = "gibtesBenutzerschonResponse", targetNamespace = "http://Webservice/", className = "Webservice.GibtesBenutzerschonResponse")
    @Action(input = "http://Webservice/Webservice/gibtesBenutzerschonRequest", output = "http://Webservice/Webservice/gibtesBenutzerschonResponse")
    public boolean gibtesBenutzerschon(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "neuesPasswortSetzen", targetNamespace = "http://Webservice/", className = "Webservice.NeuesPasswortSetzen")
    @ResponseWrapper(localName = "neuesPasswortSetzenResponse", targetNamespace = "http://Webservice/", className = "Webservice.NeuesPasswortSetzenResponse")
    @Action(input = "http://Webservice/Webservice/neuesPasswortSetzenRequest", output = "http://Webservice/Webservice/neuesPasswortSetzenResponse")
    public boolean neuesPasswortSetzen(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "passwortSperren", targetNamespace = "http://Webservice/", className = "Webservice.PasswortSperren")
    @ResponseWrapper(localName = "passwortSperrenResponse", targetNamespace = "http://Webservice/", className = "Webservice.PasswortSperrenResponse")
    @Action(input = "http://Webservice/Webservice/passwortSperrenRequest", output = "http://Webservice/Webservice/passwortSperrenResponse")
    public void passwortSperren(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<Webservice.ComOrgaEinheit>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOrgaEinheiten", targetNamespace = "http://Webservice/", className = "Webservice.GetOrgaEinheiten")
    @ResponseWrapper(localName = "getOrgaEinheitenResponse", targetNamespace = "http://Webservice/", className = "Webservice.GetOrgaEinheitenResponse")
    @Action(input = "http://Webservice/Webservice/getOrgaEinheitenRequest", output = "http://Webservice/Webservice/getOrgaEinheitenResponse")
    public List<ComOrgaEinheit> getOrgaEinheiten(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg6
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "OrgaEinheitErstellen")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "OrgaEinheitErstellen", targetNamespace = "http://Webservice/", className = "Webservice.OrgaEinheitErstellen")
    @ResponseWrapper(localName = "OrgaEinheitErstellenResponse", targetNamespace = "http://Webservice/", className = "Webservice.OrgaEinheitErstellenResponse")
    @Action(input = "http://Webservice/Webservice/OrgaEinheitErstellenRequest", output = "http://Webservice/Webservice/OrgaEinheitErstellenResponse")
    public boolean orgaEinheitErstellen(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        int arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        int arg6);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<Webservice.ComStrichart>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStrichelArten", targetNamespace = "http://Webservice/", className = "Webservice.GetStrichelArten")
    @ResponseWrapper(localName = "getStrichelArtenResponse", targetNamespace = "http://Webservice/", className = "Webservice.GetStrichelArtenResponse")
    @Action(input = "http://Webservice/Webservice/getStrichelArtenRequest", output = "http://Webservice/Webservice/getStrichelArtenResponse")
    public List<ComStrichart> getStrichelArten(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "neueStrichelart", targetNamespace = "http://Webservice/", className = "Webservice.NeueStrichelart")
    @ResponseWrapper(localName = "neueStrichelartResponse", targetNamespace = "http://Webservice/", className = "Webservice.NeueStrichelartResponse")
    @Action(input = "http://Webservice/Webservice/neueStrichelartRequest", output = "http://Webservice/Webservice/neueStrichelartResponse")
    public boolean neueStrichelart(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<Webservice.ComBerechtigung>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAlleBerechtigungen", targetNamespace = "http://Webservice/", className = "Webservice.GetAlleBerechtigungen")
    @ResponseWrapper(localName = "getAlleBerechtigungenResponse", targetNamespace = "http://Webservice/", className = "Webservice.GetAlleBerechtigungenResponse")
    @Action(input = "http://Webservice/Webservice/getAlleBerechtigungenRequest", output = "http://Webservice/Webservice/getAlleBerechtigungenResponse")
    public List<ComBerechtigung> getAlleBerechtigungen(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gibtEsStrichelBezeichnungSchon", targetNamespace = "http://Webservice/", className = "Webservice.GibtEsStrichelBezeichnungSchon")
    @ResponseWrapper(localName = "gibtEsStrichelBezeichnungSchonResponse", targetNamespace = "http://Webservice/", className = "Webservice.GibtEsStrichelBezeichnungSchonResponse")
    @Action(input = "http://Webservice/Webservice/gibtEsStrichelBezeichnungSchonRequest", output = "http://Webservice/Webservice/gibtEsStrichelBezeichnungSchonResponse")
    public boolean gibtEsStrichelBezeichnungSchon(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "StrichelArtBezeichnungAendern")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "StrichelArtBezeichnungAendern", targetNamespace = "http://Webservice/", className = "Webservice.StrichelArtBezeichnungAendern")
    @ResponseWrapper(localName = "StrichelArtBezeichnungAendernResponse", targetNamespace = "http://Webservice/", className = "Webservice.StrichelArtBezeichnungAendernResponse")
    @Action(input = "http://Webservice/Webservice/StrichelArtBezeichnungAendernRequest", output = "http://Webservice/Webservice/StrichelArtBezeichnungAendernResponse")
    public boolean strichelArtBezeichnungAendern(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

}
