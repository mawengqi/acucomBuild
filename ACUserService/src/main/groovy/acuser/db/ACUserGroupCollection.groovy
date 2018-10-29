package acuser.db

import chat.errors.CoreException
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoCursor
import com.mongodb.client.model.UpdateOptions
import com.mongodb.client.result.UpdateResult
import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.DBCollection
import acuser.data.ACUser
import acuser.error.Errors
import org.bson.Document
import script.groovy.annotation.Bean
import script.memodb.ObjectId
import acuser.utils.ValidateUtils

/**
 * Created by youze on 2018/10/24
 */
@DBCollection(name = "ac_usergroup", databaseClass = "db.ACUserDatabase")
@Bean
public class ACUserGroupCollection extends MongoCollectionHelper {


}
