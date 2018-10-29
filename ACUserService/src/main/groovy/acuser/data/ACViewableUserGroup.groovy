package acuser.data

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument
class ACViewableUserGroup extends BaseObject{
    /**
     * userGroupId
     * viewType
     * companyRelation
     * userGroup
     */
    public static final int VIEWTYPE_USER = 10
    public static final int VIEWTYPE_USER_USERGROUP = 30
    public static final String FIELD_USERGROUPID = "ugid"
    public static final String FIELD_VIEWTYPE = "type"
    public static final String FIELD_COMPANYRELATION = "relation"
    public static final String FIELD_USERGROUP = "ugrp"
    @DocumentField(key = "ugid")
    private String userGroupId
    @DocumentField(key = "type")
    private Integer viewType
    @DocumentField(key = "relation")
    private ACCompanyRelation companyRelation
    @DocumentField(key = "ugrp")
    private ACUserGroup userGroup
    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_USERGROUPID, userGroupId)
                .append(FIELD_VIEWTYPE, viewType)
                .append(FIELD_COMPANYRELATION, companyRelation)
                .append(FIELD_USERGROUP, userGroup)
        return document
    }
    String getUserGroupId() {
        return userGroupId
    }

    void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId
    }

    Integer getViewType() {
        return viewType
    }

    void setViewType(Integer viewType) {
        this.viewType = viewType
    }

    ACCompanyRelation getCompanyRelation() {
        return companyRelation
    }

    void setCompanyRelation(ACCompanyRelation companyRelation) {
        this.companyRelation = companyRelation
    }

    ACUserGroup getUserGroup() {
        return userGroup
    }

    void setUserGroup(ACUserGroup userGroup) {
        this.userGroup = userGroup
    }
}
