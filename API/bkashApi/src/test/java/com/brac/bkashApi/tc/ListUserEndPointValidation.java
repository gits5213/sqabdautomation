package com.brac.bkashApi.tc;

import com.brac.bkashApi.utilities.Data;
import static org.testng.Assert.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.response.*;
import org.testng.annotations.Test;

public class ListUserEndPointValidation {
    String resourceEndPoint = "api/users";
    String parameter = "?page=";
    int pageNum = 2;

    String GETListOfUsersEndPoint = Data.SERVICE_END_POINT + resourceEndPoint + parameter + pageNum;

    @Test
    public void listUserEndPointValidation(){
<<<<<<< HEAD

        System.out.println(GETListOfUsersEndPoint);

=======
        System.out.println(GETListOfUsersEndPoint);
>>>>>>> 3621d1ef1cd04503958745d403704f6996431e89
        Response GetListResponse =
                        given().
                                when().
                                    get(GETListOfUsersEndPoint);

        GetListResponse.then()
                .assertThat()
                .time(lessThan(1000L))
                .statusCode(Data.SUCCESSFUL_STATUS_CODE)//.log().all()
            .body("page", equalTo(2),
                "per_page", equalTo(6),
                "total", equalTo (12),
                "total_pages", equalTo (2));
        assertNotNull(GetListResponse);

        String listResp = GetListResponse.getBody().asString();
        System.out.println(Data.RESPONSE_BODY_IS + listResp);

        int listStatusCode = GetListResponse.getStatusCode();
        System.err.println(Data.RESPONSE_STATUS_CODE_IS + listStatusCode);

        long listResponseTime = GetListResponse.getTime();
        System.out.println(Data.RESPONSE_TIME_IS + listResponseTime);

    }

}
