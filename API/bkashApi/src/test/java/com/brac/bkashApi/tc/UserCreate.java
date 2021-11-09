package com.brac.bkashApi.tc;

import com.brac.bkashApi.protocolObjectModel.PostMethods;
import org.testng.annotations.Test;
import com.brac.bkashApi.utilities.Data;
import static org.testng.Assert.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.response.*;

public class UserCreate {
    String resourceEndPoint = "api/users/";

    String POSTUsersEndPoint = Data.SERVICE_END_POINT+ resourceEndPoint;

    @Test
    public void userCreate(){
        System.out.println(POSTUsersEndPoint);
        System.err.println("=======POST Operation Execution Started =============");

        Response PostCreateUserResponse = given().
                /*headers(Data.contentType, Data.ContentTypeValue,
                            Data.SubscriptionKey, Data.SubscriptionKeyValue,
                            Data.Authorization, Data.BearerToken + access_token)
                            */
                        body(PostMethods.createRandomUser(PostMethods.randomGivenUserName)).
                        when().
                        post(POSTUsersEndPoint);

        PostCreateUserResponse.then()
                .assertThat()
                .time(lessThan(1000L))
                .statusCode(Data.SUCCESSFULLY_CREATED_STATUS_CODE).log().all();
//        						.body("page", equalTo(2),
//        								"per_page", equalTo(6),
//        								"total", equalTo (12),
//        								"total_pages", equalTo (2));

        assertNotNull(PostCreateUserResponse);

        String listResp = PostCreateUserResponse.getBody().asString();
        System.out.println(Data.RESPONSE_BODY_IS + listResp);

        int listStatusCode = PostCreateUserResponse.getStatusCode();
        System.err.println(Data.RESPONSE_STATUS_CODE_IS + listStatusCode);

        long listResponseTime = PostCreateUserResponse.getTime();
        System.out.println(Data.RESPONSE_TIME_IS + listResponseTime);

    }
}
