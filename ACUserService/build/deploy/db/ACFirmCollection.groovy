package acuser.db

import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.DBCollection

/**
 * Created by wenqi on 2018/10/26
 */
@DBCollection(name = "acfirm", databaseClass = "db.ACUserDatabase")
class ACFirmCollection extends MongoCollectionHelper{

}
