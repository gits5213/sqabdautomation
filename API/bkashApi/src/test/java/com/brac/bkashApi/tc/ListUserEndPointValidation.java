package com.brac.bkashApi.tc;

import com.brac.bkashApi.utilities.Data;
import static org.testng.Assert.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.response.*;
import org.testng.annotations.Test;

public class ListUserEndPointValidation {
    String resourceEndPoint = "users";
    String parameter = "?page=";
    int pageNum = 2;

    String GETListOfUsersEndPoint = Data.SERVICE_END_POINT + resourceEndPoint + parameter + pageNum;

    @Test
    public void listUserEndPointValidation(){

        Response GetListResponse =
                        given().
                                when().
                                    get(GETListOfUsersEndPoint);

        GetListResponse.then()
                .assertThat()
                .time(lessThan(5000L))
                .statusCode(Data.SUCCESSFULL_STATUS_CODE).log().all();

        assertNotNull(GetListResponse);
    }

}
