package acuser.db

import acuser.data.ACUser
import acuser.error.Errors
import acuser.utils.ValidateUtils
import chat.errors.CoreException
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoCollection
import com.mongodb.client.MongoCursor
import com.mongodb.client.model.UpdateOptions
import com.mongodb.client.result.UpdateResult
import connectors.mongodb.MongoCollectionHelper
import connectors.mongodb.annotations.DBCollection
import org.bson.Document
import script.groovy.annotation.Bean
import script.memodb.ObjectId

/**
 * Created by youze on 2018/10/24
 */
@DBCollection(name = "ac_groupuserindex", databaseClass = "db.ACUserDatabase")
@Bean
public class ACGroupUserIndexCollection extends MongoCollectionHelper {



}
