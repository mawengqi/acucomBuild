package acuser.data

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import acuser.language.ACLanguage
import org.bson.Document

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument(collectionClass = "db.ACFirmCollection")
class ACFirm extends DataObject{
    public static final String FIELD_DOMAIN = "fid"
    public static final String FIELD_FIRMNAME = "name"
    public static final String FIELD_LOGO = "logo"
    public static final String FIELD_WEBSITE = "site"
    public static final String FIELD_DESCRIPTION = "desp"
    public static final String FIELD_CREATETIME = "ctime"
    public static final String FIELD_SUSPENDTIME = "stime"
    public static final String FIELD_CONTACTEMAIL = "cmail"
    public static final String FIELD_CONTACTADDRESS = "cadd"
    public static final String FIELD_NUMBEROFFIRMUSER = "nfu"
    public static final String FIELD_CURRENTUSERNUMBER = "cnum"
    public static final String FIELD_VOICECALLMAXPARTICIPANTS = "vcmp"
    public static final String FIELD_PRESENTERMAXPARTICIPANTS = "pmp"
    public static final String FIELD_LDAPENABLE = "lenable"
    public static final String FIELD_LDAPTYPE = "ltype"
    public static final String FIELD_LDAPLMSURL = "lmsurl"
    public static final String FIELD_AMSERVER = "am"
    public static final String FIELD_VIDEOSERVER = "vserver"
    public static final String FIELD_LANGUAGE = "la"
    public static final String FIELD_ADMINIDS = "admn"


//    public static final String FIELD_TYPE = "type"
//    public static final String FIELD_ACCOUNT_LDAP = "ac_" + Account.TYPE_LDAP
    
    @DocumentField(key = "fid")
    private String domain
    @DocumentField(key = "name")
    private String firmName
    @DocumentField(key = "logo")
    private String logo
    @DocumentField(key = "site")
    private String website
    @DocumentField(key = "desp")
    private String description
    @DocumentField(key = "ctime")
    private Long createTime
    @DocumentField(key = "stime")
    private Long suspendTime
    @DocumentField(key = "cmail")
    private String contactEmail
    @DocumentField(key = "cadd")
    private String contactAddress
    @DocumentField(key = "nfu")
    private Integer numberOfFirmUser
    @DocumentField(key = "cnum")
    private Integer currentUserNumber
    @DocumentField(key = "vcmp")
    private Integer voicecallMaxParticipants
    @DocumentField(key = "pmp")
    private Integer presenterMaxParticipants
    @DocumentField(key = "lenable")
    private Boolean ldapEnable
    @DocumentField(key = "ltype")
    private String ldapType
    @DocumentField(key = "lmsurl")
    private String ldapLmsUrl
    @DocumentField(key = "am")
    private String amServer
    @DocumentField(key = "vserver")
    private String videoServer
    @DocumentField(key = "la")
    private ACLanguage language
    @DocumentField(key = "admn")
    private List<String> adminIds

//    private FirmLdapInfo firmLdapInfo

    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_DOMAIN, domain)
                .append(FIELD_FIRMNAME, firmName)
                .append(FIELD_LOGO, logo)
                .append(FIELD_WEBSITE, website)
                .append(FIELD_DESCRIPTION, description)
                .append(FIELD_CREATETIME, createTime)
                .append(FIELD_SUSPENDTIME, suspendTime)
                .append(FIELD_CONTACTEMAIL, contactEmail)
                .append(FIELD_CONTACTADDRESS, contactAddress)
                .append(FIELD_NUMBEROFFIRMUSER, numberOfFirmUser)
                .append(FIELD_CURRENTUSERNUMBER, currentUserNumber)
                .append(FIELD_VOICECALLMAXPARTICIPANTS, voicecallMaxParticipants)
                .append(FIELD_PRESENTERMAXPARTICIPANTS, presenterMaxParticipants)
                .append(FIELD_LDAPENABLE, ldapEnable)
                .append(FIELD_LDAPTYPE, ldapType)
                .append(FIELD_LDAPLMSURL, ldapLmsUrl)
                .append(FIELD_AMSERVER, amServer)
                .append(FIELD_VIDEOSERVER, videoServer)
                .append(FIELD_LANGUAGE, language)
                .append(FIELD_ADMINIDS, adminIds)
        return document
    }
}
