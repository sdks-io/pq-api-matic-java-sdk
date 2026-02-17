/*
 * PayQuickerSDK
 *
 * This file was automatically generated for PayQuicker by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.mypayquicker.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.mypayquicker.api.ApiHelper;
import com.mypayquicker.api.PayQuickerSDKClient;
import com.mypayquicker.api.exceptions.ApiException;
import com.mypayquicker.api.models.CreateOrUpdateUser;
import com.mypayquicker.api.models.Languages;
import com.mypayquicker.api.models.UserListResult;
import com.mypayquicker.api.models.UserResult;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UsersControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PayQuickerSDKClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static UsersController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getUsersController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Retrieve a list of [users](page:resources/user) that supports filtering, sorting, and
     * pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListUsers() throws Exception {
        // Parameters for the API call
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        UserListResult result = null;
        try {
            result = controller.listUsers(page, pageSize, filter, sort, language);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"payload\":[{\"token\":\"user-19c60cc6-71c3-4db0-9092-4d422410c87e\",\"addressLi"
                + "ne1\":\"400 Linden Oaks\",\"addressLine2\":\"Rochester, NY 14625-2818\",\"city"
                + "\":\"Rochester\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"countryOfNationa"
                + "lity\":\"US\",\"createdOn\":\"2021-06-07T21:23:41Z\",\"dateOfBirth\":\"1991-04-1"
                + "3T00:00:00Z\",\"email\":\"PQTESTEMAIL+Caden_Aufderhar@GMAIL.COM\",\"firstName\":"
                + "\"Susie\",\"gender\":\"MALE\",\"language\":\"en-US\",\"lastName\":\"Fadel\",\"mo"
                + "bileNumber\":\"+1 585-987-6543\",\"mobileNumberCountry\":\"US\",\"phoneNumber\":"
                + "\"+1 585-987-6543\",\"phoneNumberCountry\":\"US\",\"postalCode\":\"14625\",\"pre"
                + "miseNumber\":\"400\",\"programUserId\":\"Haley_Ryan\",\"region\":\"NY\",\"status"
                + "\":\"ACTIVE\",\"userType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://api.san"
                + "dbox.payquicker.io/api/v2/users/user-19c60cc6-71c3-4db0-9092-4d422410c87e\",\"pa"
                + "rams\":{\"rel\":\"self\"}}]},{\"token\":\"user-2d926d31-a609-40e1-b28a-a32e0aeb6"
                + "a79\",\"addressLine1\":\"400 Linden Oaks\",\"addressLine2\":\"Rochester, NY 1462"
                + "5-2818\",\"city\":\"Rochester\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"c"
                + "ountryOfNationality\":\"US\",\"createdOn\":\"2021-06-08T16:04:54Z\",\"dateOfBirt"
                + "h\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+Milton_Cronin9@GMAIL.COM\","
                + "\"firstName\":\"Alycia\",\"gender\":\"MALE\",\"language\":\"en-US\",\"lastName"
                + "\":\"McLaughlin\",\"mobileNumber\":\"+1 585-987-6543\",\"mobileNumberCountry\":"
                + "\"US\",\"phoneNumber\":\"+1 585-987-6543\",\"phoneNumberCountry\":\"US\",\"posta"
                + "lCode\":\"14625\",\"premiseNumber\":\"400\",\"programUserId\":\"Elliot.Sawayn\","
                + "\"region\":\"NY\",\"status\":\"ACTIVE\",\"userType\":\"INDIVIDUAL\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2d926d31-a609-40e"
                + "1-b28a-a32e0aeb6a79\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"user-80df50a"
                + "2-3cc8-462d-87c8-cf3e266994c8\",\"addressLine1\":\"400 Linden Oaks\",\"addressLi"
                + "ne2\":\"Rochester, NY 14625-2818\",\"city\":\"Rochester\",\"country\":\"US\",\"c"
                + "ountryOfBirth\":\"US\",\"countryOfNationality\":\"US\",\"createdOn\":\"2021-06-0"
                + "8T16:13:53Z\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+M"
                + "eta50@GMAIL.COM\",\"firstName\":\"Trisha\",\"gender\":\"MALE\",\"governmentId\":"
                + "\"000000000\",\"language\":\"en-US\",\"lastName\":\"Leffler\",\"mobileNumber\":"
                + "\"+1 585-987-6543\",\"mobileNumberCountry\":\"US\",\"phoneNumber\":\"+1 585-987-"
                + "6543\",\"phoneNumberCountry\":\"US\",\"postalCode\":\"14625\",\"premiseNumber\":"
                + "\"400\",\"programUserId\":\"Nona49\",\"region\":\"NY\",\"status\":\"ACTIVE\",\"u"
                + "serType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.i"
                + "o/api/v2/users/user-80df50a2-3cc8-462d-87c8-cf3e266994c8\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"user-b26db8d1-ebb1-4367-aad4-3ffb6f0f17cf\",\"addressL"
                + "ine1\":\"400 Linden Oaks\",\"addressLine2\":\"Rochester, NY 14625-2818\",\"city"
                + "\":\"Rochester\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"countryOfNationa"
                + "lity\":\"US\",\"createdOn\":\"2021-06-08T16:21:54Z\",\"dateOfBirth\":\"1991-04-1"
                + "3T00:00:00Z\",\"email\":\"PQTESTEMAIL+Frankie_Stoltenberg@GMAIL.COM\",\"firstNam"
                + "e\":\"Kevon\",\"gender\":\"MALE\",\"governmentId\":\"000000000\",\"language\":"
                + "\"en-US\",\"lastName\":\"Waelchi\",\"mobileNumber\":\"+1 585-987-6543\",\"mobile"
                + "NumberCountry\":\"US\",\"phoneNumber\":\"+1 585-987-6543\",\"phoneNumberCountry"
                + "\":\"US\",\"postalCode\":\"14625\",\"premiseNumber\":\"400\",\"programUserId\":"
                + "\"Lydia_Jacobi13\",\"region\":\"NY\",\"status\":\"ACTIVE\",\"userType\":\"INDIVI"
                + "DUAL\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/use"
                + "r-b26db8d1-ebb1-4367-aad4-3ffb6f0f17cf\",\"params\":{\"rel\":\"self\"}}]},{\"tok"
                + "en\":\"user-61b12c1f-7cff-42e3-9c56-09ba2b08d2ed\",\"addressLine1\":\"4179 BUFFA"
                + "LO ROAD\",\"businessAddressLine1\":\"400 Linden Oaks\",\"businessAddressType\":"
                + "\"BUSINESS\",\"businessCity\":\"Rochester\",\"businessCountry\":\"US\",\"busines"
                + "sName\":\"Api V2 Company LLC\",\"businessOperatingName\":\"Api V2 Company LLC\","
                + "\"businessPostalCode\":\"14625\",\"businessRegion\":\"NY\",\"businessRegistratio"
                + "nCountry\":\"US\",\"businessRegistrationRegion\":\"NY\",\"city\":\"NORTH CHILI"
                + "\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"countryOfNationality\":\"US\","
                + "\"createdOn\":\"2021-06-08T16:36:05Z\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\","
                + "\"email\":\"PQTESTEMAIL+Helena.Skiles24@GMAIL.COM\",\"firstName\":\"Westley\","
                + "\"gender\":\"MALE\",\"governmentId\":\"000000000\",\"language\":\"en-US\",\"last"
                + "Name\":\"Westley\",\"mobileNumber\":\"+1 585-987-6543\",\"mobileNumberCountry\":"
                + "\"US\",\"phoneNumber\":\"+1 585-987-6543\",\"phoneNumberCountry\":\"US\",\"posta"
                + "lCode\":\"14514\",\"premiseNumber\":\"400\",\"programUserId\":\"Nicholas94\",\"r"
                + "egion\":\"NY\",\"status\":\"ACTIVE\",\"userType\":\"BUSINESS\",\"links\":[{\"hre"
                + "f\":\"https://api.sandbox.payquicker.io/api/v2/users/user-61b12c1f-7cff-42e3-9c5"
                + "6-09ba2b08d2ed\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pageNo\":\"1\","
                + "\"pageSize\":\"5\",\"pageCount\":\"124\",\"recordCount\":\"618\",\"timezone\":"
                + "\"GMT\",\"requestRef\":\"request-reference-value\"},\"links\":[{\"href\":\"https"
                + "://api.sandbox.payquicker.io/api/v2/users?pageSize=5&page=1\",\"params\":{\"rel"
                + "\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a list of [users](page:resources/user) that supports filtering, sorting, and
     * pagination through existing mechanisms. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestListUsers1() throws Exception {
        // Parameters for the API call
        int page = 1;
        int pageSize = 20;
        String filter = 
                "string";
        String sort = 
                "string";
        Languages language = Languages.fromString(
                "en-US");

        // Set callback and perform API call
        UserListResult result = null;
        try {
            result = controller.listUsers(page, pageSize, filter, sort, language);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"payload\":[{\"token\":\"user-19c60cc6-71c3-4db0-9092-4d422410c87e\",\"addressLi"
                + "ne1\":\"400 Linden Oaks\",\"addressLine2\":\"Rochester, NY 14625-2818\",\"city"
                + "\":\"Rochester\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"countryOfNationa"
                + "lity\":\"US\",\"createdOn\":\"2021-06-07T21:23:41Z\",\"dateOfBirth\":\"1991-04-1"
                + "3T00:00:00Z\",\"email\":\"PQTESTEMAIL+Caden_Aufderhar@GMAIL.COM\",\"firstName\":"
                + "\"Susie\",\"gender\":\"MALE\",\"language\":\"en-US\",\"lastName\":\"Fadel\",\"mo"
                + "bileNumber\":\"+1 585-987-6543\",\"mobileNumberCountry\":\"US\",\"phoneNumber\":"
                + "\"+1 585-987-6543\",\"phoneNumberCountry\":\"US\",\"postalCode\":\"14625\",\"pre"
                + "miseNumber\":\"400\",\"programUserId\":\"Haley_Ryan\",\"region\":\"NY\",\"status"
                + "\":\"ACTIVE\",\"userType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://api.san"
                + "dbox.payquicker.io/api/v2/users/user-19c60cc6-71c3-4db0-9092-4d422410c87e\",\"pa"
                + "rams\":{\"rel\":\"self\"}}]},{\"token\":\"user-2d926d31-a609-40e1-b28a-a32e0aeb6"
                + "a79\",\"addressLine1\":\"400 Linden Oaks\",\"addressLine2\":\"Rochester, NY 1462"
                + "5-2818\",\"city\":\"Rochester\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"c"
                + "ountryOfNationality\":\"US\",\"createdOn\":\"2021-06-08T16:04:54Z\",\"dateOfBirt"
                + "h\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+Milton_Cronin9@GMAIL.COM\","
                + "\"firstName\":\"Alycia\",\"gender\":\"MALE\",\"language\":\"en-US\",\"lastName"
                + "\":\"McLaughlin\",\"mobileNumber\":\"+1 585-987-6543\",\"mobileNumberCountry\":"
                + "\"US\",\"phoneNumber\":\"+1 585-987-6543\",\"phoneNumberCountry\":\"US\",\"posta"
                + "lCode\":\"14625\",\"premiseNumber\":\"400\",\"programUserId\":\"Elliot.Sawayn\","
                + "\"region\":\"NY\",\"status\":\"ACTIVE\",\"userType\":\"INDIVIDUAL\",\"links\":[{"
                + "\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/user-2d926d31-a609-40e"
                + "1-b28a-a32e0aeb6a79\",\"params\":{\"rel\":\"self\"}}]},{\"token\":\"user-80df50a"
                + "2-3cc8-462d-87c8-cf3e266994c8\",\"addressLine1\":\"400 Linden Oaks\",\"addressLi"
                + "ne2\":\"Rochester, NY 14625-2818\",\"city\":\"Rochester\",\"country\":\"US\",\"c"
                + "ountryOfBirth\":\"US\",\"countryOfNationality\":\"US\",\"createdOn\":\"2021-06-0"
                + "8T16:13:53Z\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+M"
                + "eta50@GMAIL.COM\",\"firstName\":\"Trisha\",\"gender\":\"MALE\",\"governmentId\":"
                + "\"000000000\",\"language\":\"en-US\",\"lastName\":\"Leffler\",\"mobileNumber\":"
                + "\"+1 585-987-6543\",\"mobileNumberCountry\":\"US\",\"phoneNumber\":\"+1 585-987-"
                + "6543\",\"phoneNumberCountry\":\"US\",\"postalCode\":\"14625\",\"premiseNumber\":"
                + "\"400\",\"programUserId\":\"Nona49\",\"region\":\"NY\",\"status\":\"ACTIVE\",\"u"
                + "serType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.i"
                + "o/api/v2/users/user-80df50a2-3cc8-462d-87c8-cf3e266994c8\",\"params\":{\"rel\":"
                + "\"self\"}}]},{\"token\":\"user-b26db8d1-ebb1-4367-aad4-3ffb6f0f17cf\",\"addressL"
                + "ine1\":\"400 Linden Oaks\",\"addressLine2\":\"Rochester, NY 14625-2818\",\"city"
                + "\":\"Rochester\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"countryOfNationa"
                + "lity\":\"US\",\"createdOn\":\"2021-06-08T16:21:54Z\",\"dateOfBirth\":\"1991-04-1"
                + "3T00:00:00Z\",\"email\":\"PQTESTEMAIL+Frankie_Stoltenberg@GMAIL.COM\",\"firstNam"
                + "e\":\"Kevon\",\"gender\":\"MALE\",\"governmentId\":\"000000000\",\"language\":"
                + "\"en-US\",\"lastName\":\"Waelchi\",\"mobileNumber\":\"+1 585-987-6543\",\"mobile"
                + "NumberCountry\":\"US\",\"phoneNumber\":\"+1 585-987-6543\",\"phoneNumberCountry"
                + "\":\"US\",\"postalCode\":\"14625\",\"premiseNumber\":\"400\",\"programUserId\":"
                + "\"Lydia_Jacobi13\",\"region\":\"NY\",\"status\":\"ACTIVE\",\"userType\":\"INDIVI"
                + "DUAL\",\"links\":[{\"href\":\"https://api.sandbox.payquicker.io/api/v2/users/use"
                + "r-b26db8d1-ebb1-4367-aad4-3ffb6f0f17cf\",\"params\":{\"rel\":\"self\"}}]},{\"tok"
                + "en\":\"user-61b12c1f-7cff-42e3-9c56-09ba2b08d2ed\",\"addressLine1\":\"4179 BUFFA"
                + "LO ROAD\",\"businessAddressLine1\":\"400 Linden Oaks\",\"businessAddressType\":"
                + "\"BUSINESS\",\"businessCity\":\"Rochester\",\"businessCountry\":\"US\",\"busines"
                + "sName\":\"Api V2 Company LLC\",\"businessOperatingName\":\"Api V2 Company LLC\","
                + "\"businessPostalCode\":\"14625\",\"businessRegion\":\"NY\",\"businessRegistratio"
                + "nCountry\":\"US\",\"businessRegistrationRegion\":\"NY\",\"city\":\"NORTH CHILI"
                + "\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"countryOfNationality\":\"US\","
                + "\"createdOn\":\"2021-06-08T16:36:05Z\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\","
                + "\"email\":\"PQTESTEMAIL+Helena.Skiles24@GMAIL.COM\",\"firstName\":\"Westley\","
                + "\"gender\":\"MALE\",\"governmentId\":\"000000000\",\"language\":\"en-US\",\"last"
                + "Name\":\"Westley\",\"mobileNumber\":\"+1 585-987-6543\",\"mobileNumberCountry\":"
                + "\"US\",\"phoneNumber\":\"+1 585-987-6543\",\"phoneNumberCountry\":\"US\",\"posta"
                + "lCode\":\"14514\",\"premiseNumber\":\"400\",\"programUserId\":\"Nicholas94\",\"r"
                + "egion\":\"NY\",\"status\":\"ACTIVE\",\"userType\":\"BUSINESS\",\"links\":[{\"hre"
                + "f\":\"https://api.sandbox.payquicker.io/api/v2/users/user-61b12c1f-7cff-42e3-9c5"
                + "6-09ba2b08d2ed\",\"params\":{\"rel\":\"self\"}}]}],\"meta\":{\"pageNo\":\"1\","
                + "\"pageSize\":\"5\",\"pageCount\":\"124\",\"recordCount\":\"618\",\"timezone\":"
                + "\"GMT\",\"requestRef\":\"request-reference-value\"},\"links\":[{\"href\":\"https"
                + "://api.sandbox.payquicker.io/api/v2/users?pageSize=5&page=1\",\"params\":{\"rel"
                + "\":\"self\"}}]}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a new [user](page:resources/user). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateUser() throws Exception {
        // Parameters for the API call
        CreateOrUpdateUser body = ApiHelper.deserialize(
                "{\"CURRENCY\":\"USD\",\"PROGRAMUSERID\":\"Jarrell_Sauer\",\"EMAIL\":\"PQTESTEMAIL+"
                + "Viviane.Legros20@GMAIL.COM\",\"FIRSTNAME\":\"Amari\",\"LASTNAME\":\"Rippin\",\"D"
                + "ATEOFBIRTH\":\"1991-04-13\",\"BUSINESSCONTACTROLE\":\"SW ENGINEER\",\"GOVERNMENT"
                + "IDTYPE\":\"SSN\",\"GOVERNMENTID\":\"000000000\",\"OCCUPATIONTITLE\":\"TESTER\","
                + "\"OCCUPATIONTYPE\":\"GOVERNMENT\",\"TAXRESIDENTSTATUS\":\"PREFER_NOT_TO_ANSWER"
                + "\",\"PHONENUMBER\":\"+15859876543\",\"MOBILENUMBER\":\"+15859876543\",\"PHONENUM"
                + "BERCOUNTRY\":\"US\",\"MOBILENUMBERCOUNTRY\":\"US\",\"ADDRESSLINE1\":\"400 Linden"
                + " Oaks\",\"ADDRESSLINE2\":\"\",\"MAILINGADDRESSLINE1\":\"123 Emory Lane\",\"MAILI"
                + "NGCOUNTRY\":\"US\",\"MAILINGCITY\":\"Rochester\",\"MAILINGREGION\":\"NY\",\"MAIL"
                + "INGPOSTALCODE\":14625,\"BUSINESSADDRESSLINE1\":\"99 Office Park\",\"BUSINESSADDR"
                + "ESSLINE2\":\"Suite 293\",\"BUSINESSCOUNTRY\":\"US\",\"BUSINESSCITY\":\"Modesto"
                + "\",\"BUSINESSREGION\":\"CA\",\"BUSINESSPOSTALCODE\":99785,\"CITY\":\"Rochester"
                + "\",\"REGION\":\"NY\",\"COUNTRY\":\"US\",\"POSTALCODE\":\"14625\",\"PREMISENUMBER"
                + "\":\"\",\"ADDRESSTYPE\":\"RESIDENTIAL\",\"EMPLOYERID\":\"1\",\"GENDER\":\"MALE"
                + "\",\"USERTYPE\":\"INDIVIDUAL\",\"LANGUAGE\":\"EN-US\",\"COUNTRYOFBIRTH\":\"US\","
                + "\"COUNTRYOFNATIONALITY\":\"US\",\"PROGRAMTOKEN\":\"prog-6a272eca-9487-d83a-c9e4-"
                + "8df8c9a7f6eb\",\"PrimaryUserToken\":\"user-35372005-a9a3-41ae-ba46-a39cf944726d"
                + "\"}",
                CreateOrUpdateUser.class);

        // Set callback and perform API call
        UserResult result = null;
        try {
            result = controller.createUser(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"token\":\"user-91acd009-36d5-40d9-b8b1-39a3704b577e\",\"addressLine1\":\"4179 B"
                + "UFFALO ROAD\",\"businessAddressLine1\":\"99 Office Park\",\"businessAddressLine2"
                + "\":\"Suite 293\",\"businessAddressType\":\"BUSINESS\",\"businessCity\":\"Modesto"
                + "\",\"businessContactRole\":\"OTHER\",\"businessCountry\":\"US\",\"businessName"
                + "\":\"Api V2 Company LLC\",\"businessPostalCode\":\"99700\",\"businessRegion\":"
                + "\"CA\",\"city\":\"NORTH CHILI\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"c"
                + "ountryOfNationality\":\"US\",\"createdOn\":\"2022-04-08T19:44:16Z\",\"currency"
                + "\":\"USD\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+Eman"
                + "uel_Carroll@GMAIL.COM\",\"employerId\":\"1\",\"firstName\":\"Timothy\",\"gender"
                + "\":\"MALE\",\"governmentId\":\"111111111\",\"governmentIdType\":\"SSN\",\"langua"
                + "ge\":\"en-US\",\"lastName\":\"Mueller\",\"mailingAddressLine1\":\"128 Maple Lane"
                + "\",\"mailingCity\":\"Rochester\",\"mailingCountry\":\"US\",\"mailingPostalCode"
                + "\":\"14625\",\"mailingRegion\":\"NY\",\"mobileNumber\":\"+15859876543\",\"mobile"
                + "NumberCountry\":\"US\",\"occupationTitle\":\"TESTER\",\"occupationType\":\"GOVER"
                + "NMENT\",\"phoneNumber\":\"+15859876543\",\"phoneNumberCountry\":\"US\",\"postalC"
                + "ode\":\"14514\",\"programUserId\":\"Kaylee.Howe8\",\"region\":\"NY\",\"taxReside"
                + "ntStatus\":\"YES\",\"userType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/users/user-91acd009-36d5-40d9-b8b1-39a3704b577e"
                + "\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Create a new [user](page:resources/user). .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateUser1() throws Exception {
        // Parameters for the API call
        CreateOrUpdateUser body = ApiHelper.deserialize(
                "{\"CURRENCY\":\"USD\",\"PROGRAMUSERID\":\"Jarrell_Sauer\",\"EMAIL\":\"PQTESTEMAIL+"
                + "Viviane.Legros20@GMAIL.COM\",\"FIRSTNAME\":\"Amari\",\"LASTNAME\":\"Rippin\",\"D"
                + "ATEOFBIRTH\":\"1991-04-13\",\"BUSINESSCONTACTROLE\":\"SW ENGINEER\",\"GOVERNMENT"
                + "IDTYPE\":\"SSN\",\"GOVERNMENTID\":\"000000000\",\"OCCUPATIONTITLE\":\"TESTER\","
                + "\"OCCUPATIONTYPE\":\"GOVERNMENT\",\"TAXRESIDENTSTATUS\":\"PREFER_NOT_TO_ANSWER"
                + "\",\"PHONENUMBER\":\"+15859876543\",\"MOBILENUMBER\":\"+15859876543\",\"PHONENUM"
                + "BERCOUNTRY\":\"US\",\"MOBILENUMBERCOUNTRY\":\"US\",\"ADDRESSLINE1\":\"400 Linden"
                + " Oaks\",\"ADDRESSLINE2\":\"\",\"MAILINGADDRESSLINE1\":\"123 Emory Lane\",\"MAILI"
                + "NGCOUNTRY\":\"US\",\"MAILINGCITY\":\"Rochester\",\"MAILINGREGION\":\"NY\",\"MAIL"
                + "INGPOSTALCODE\":14625,\"BUSINESSADDRESSLINE1\":\"99 Office Park\",\"BUSINESSADDR"
                + "ESSLINE2\":\"Suite 293\",\"BUSINESSCOUNTRY\":\"US\",\"BUSINESSCITY\":\"Modesto"
                + "\",\"BUSINESSREGION\":\"CA\",\"BUSINESSPOSTALCODE\":99785,\"CITY\":\"Rochester"
                + "\",\"REGION\":\"NY\",\"COUNTRY\":\"US\",\"POSTALCODE\":\"14625\",\"PREMISENUMBER"
                + "\":\"\",\"ADDRESSTYPE\":\"RESIDENTIAL\",\"EMPLOYERID\":\"1\",\"GENDER\":\"MALE"
                + "\",\"USERTYPE\":\"INDIVIDUAL\",\"LANGUAGE\":\"EN-US\",\"COUNTRYOFBIRTH\":\"US\","
                + "\"COUNTRYOFNATIONALITY\":\"US\",\"PROGRAMTOKEN\":\"prog-6a272eca-9487-d83a-c9e4-"
                + "8df8c9a7f6eb\",\"PrimaryUserToken\":\"user-35372005-a9a3-41ae-ba46-a39cf944726d"
                + "\"}",
                CreateOrUpdateUser.class);

        // Set callback and perform API call
        UserResult result = null;
        try {
            result = controller.createUser(body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"token\":\"user-91acd009-36d5-40d9-b8b1-39a3704b577e\",\"addressLine1\":\"4179 B"
                + "UFFALO ROAD\",\"businessAddressLine1\":\"99 Office Park\",\"businessAddressLine2"
                + "\":\"Suite 293\",\"businessAddressType\":\"BUSINESS\",\"businessCity\":\"Modesto"
                + "\",\"businessContactRole\":\"OTHER\",\"businessCountry\":\"US\",\"businessName"
                + "\":\"Api V2 Company LLC\",\"businessPostalCode\":\"99700\",\"businessRegion\":"
                + "\"CA\",\"city\":\"NORTH CHILI\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"c"
                + "ountryOfNationality\":\"US\",\"createdOn\":\"2022-04-08T19:44:16Z\",\"currency"
                + "\":\"USD\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+Eman"
                + "uel_Carroll@GMAIL.COM\",\"employerId\":\"1\",\"firstName\":\"Timothy\",\"gender"
                + "\":\"MALE\",\"governmentId\":\"111111111\",\"governmentIdType\":\"SSN\",\"langua"
                + "ge\":\"en-US\",\"lastName\":\"Mueller\",\"mailingAddressLine1\":\"128 Maple Lane"
                + "\",\"mailingCity\":\"Rochester\",\"mailingCountry\":\"US\",\"mailingPostalCode"
                + "\":\"14625\",\"mailingRegion\":\"NY\",\"mobileNumber\":\"+15859876543\",\"mobile"
                + "NumberCountry\":\"US\",\"occupationTitle\":\"TESTER\",\"occupationType\":\"GOVER"
                + "NMENT\",\"phoneNumber\":\"+15859876543\",\"phoneNumberCountry\":\"US\",\"postalC"
                + "ode\":\"14514\",\"programUserId\":\"Kaylee.Howe8\",\"region\":\"NY\",\"taxReside"
                + "ntStatus\":\"YES\",\"userType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/users/user-91acd009-36d5-40d9-b8b1-39a3704b577e"
                + "\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Update a [user](page:resources/user) object (change
     * [email](#/rest/models/structures/email-address)], [address](#/rest/models/structures/address)
     * change, etc.) using a user token.' .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateUser() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";
        CreateOrUpdateUser body = ApiHelper.deserialize(
                "{\"CURRENCY\":\"USD\",\"PROGRAMUSERID\":\"Jarrell_Sauer\",\"EMAIL\":\"PQTESTEMAIL+"
                + "Viviane.Legros20@GMAIL.COM\",\"FIRSTNAME\":\"Amari\",\"LASTNAME\":\"Rippin\",\"D"
                + "ATEOFBIRTH\":\"1991-04-13\",\"BUSINESSCONTACTROLE\":\"SW ENGINEER\",\"GOVERNMENT"
                + "IDTYPE\":\"SSN\",\"GOVERNMENTID\":\"000000000\",\"OCCUPATIONTITLE\":\"TESTER\","
                + "\"OCCUPATIONTYPE\":\"GOVERNMENT\",\"TAXRESIDENTSTATUS\":\"PREFER_NOT_TO_ANSWER"
                + "\",\"PHONENUMBER\":\"+15859876543\",\"MOBILENUMBER\":\"+15859876543\",\"PHONENUM"
                + "BERCOUNTRY\":\"US\",\"MOBILENUMBERCOUNTRY\":\"US\",\"ADDRESSLINE1\":\"400 Linden"
                + " Oaks\",\"ADDRESSLINE2\":\"\",\"MAILINGADDRESSLINE1\":\"123 Emory Lane\",\"MAILI"
                + "NGCOUNTRY\":\"US\",\"MAILINGCITY\":\"Rochester\",\"MAILINGREGION\":\"NY\",\"MAIL"
                + "INGPOSTALCODE\":14625,\"BUSINESSADDRESSLINE1\":\"99 Office Park\",\"BUSINESSADDR"
                + "ESSLINE2\":\"Suite 293\",\"BUSINESSCOUNTRY\":\"US\",\"BUSINESSCITY\":\"Modesto"
                + "\",\"BUSINESSREGION\":\"CA\",\"BUSINESSPOSTALCODE\":99785,\"CITY\":\"Rochester"
                + "\",\"REGION\":\"NY\",\"COUNTRY\":\"US\",\"POSTALCODE\":\"14625\",\"PREMISENUMBER"
                + "\":\"\",\"ADDRESSTYPE\":\"RESIDENTIAL\",\"EMPLOYERID\":\"1\",\"GENDER\":\"MALE"
                + "\",\"USERTYPE\":\"INDIVIDUAL\",\"LANGUAGE\":\"EN-US\",\"COUNTRYOFBIRTH\":\"US\","
                + "\"COUNTRYOFNATIONALITY\":\"US\",\"PROGRAMTOKEN\":\"prog-6a272eca-9487-d83a-c9e4-"
                + "8df8c9a7f6eb\",\"PrimaryUserToken\":\"user-35372005-a9a3-41ae-ba46-a39cf944726d"
                + "\"}",
                CreateOrUpdateUser.class);

        // Set callback and perform API call
        UserResult result = null;
        try {
            result = controller.updateUser(userToken, body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"token\":\"user-91acd009-36d5-40d9-b8b1-39a3704b577e\",\"addressLine1\":\"4179 B"
                + "UFFALO ROAD\",\"businessAddressLine1\":\"99 Office Park\",\"businessAddressLine2"
                + "\":\"Suite 293\",\"businessAddressType\":\"BUSINESS\",\"businessCity\":\"Modesto"
                + "\",\"businessContactRole\":\"OTHER\",\"businessCountry\":\"US\",\"businessName"
                + "\":\"Api V2 Company LLC\",\"businessPostalCode\":\"99700\",\"businessRegion\":"
                + "\"CA\",\"city\":\"NORTH CHILI\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"c"
                + "ountryOfNationality\":\"US\",\"createdOn\":\"2022-04-08T19:44:16Z\",\"currency"
                + "\":\"USD\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+Eman"
                + "uel_Carroll@GMAIL.COM\",\"employerId\":\"1\",\"firstName\":\"Timothy\",\"gender"
                + "\":\"MALE\",\"governmentId\":\"111111111\",\"governmentIdType\":\"SSN\",\"langua"
                + "ge\":\"en-US\",\"lastName\":\"Mueller\",\"mailingAddressLine1\":\"128 Maple Lane"
                + "\",\"mailingCity\":\"Rochester\",\"mailingCountry\":\"US\",\"mailingPostalCode"
                + "\":\"14625\",\"mailingRegion\":\"NY\",\"mobileNumber\":\"+15859876543\",\"mobile"
                + "NumberCountry\":\"US\",\"occupationTitle\":\"TESTER\",\"occupationType\":\"GOVER"
                + "NMENT\",\"phoneNumber\":\"+15859876543\",\"phoneNumberCountry\":\"US\",\"postalC"
                + "ode\":\"14514\",\"programUserId\":\"Kaylee.Howe8\",\"region\":\"NY\",\"taxReside"
                + "ntStatus\":\"YES\",\"userType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/users/user-91acd009-36d5-40d9-b8b1-39a3704b577e"
                + "\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [user](page:resources/user) record by user token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveUser() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        UserResult result = null;
        try {
            result = controller.retrieveUser(userToken);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"token\":\"user-91acd009-36d5-40d9-b8b1-39a3704b577e\",\"addressLine1\":\"4179 B"
                + "UFFALO ROAD\",\"businessAddressLine1\":\"99 Office Park\",\"businessAddressLine2"
                + "\":\"Suite 293\",\"businessAddressType\":\"BUSINESS\",\"businessCity\":\"Modesto"
                + "\",\"businessContactRole\":\"OTHER\",\"businessCountry\":\"US\",\"businessName"
                + "\":\"Api V2 Company LLC\",\"businessPostalCode\":\"99700\",\"businessRegion\":"
                + "\"CA\",\"city\":\"NORTH CHILI\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"c"
                + "ountryOfNationality\":\"US\",\"createdOn\":\"2022-04-08T19:44:16Z\",\"currency"
                + "\":\"USD\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+Eman"
                + "uel_Carroll@GMAIL.COM\",\"employerId\":\"1\",\"firstName\":\"Timothy\",\"gender"
                + "\":\"MALE\",\"governmentId\":\"111111111\",\"governmentIdType\":\"SSN\",\"langua"
                + "ge\":\"en-US\",\"lastName\":\"Mueller\",\"mailingAddressLine1\":\"128 Maple Lane"
                + "\",\"mailingCity\":\"Rochester\",\"mailingCountry\":\"US\",\"mailingPostalCode"
                + "\":\"14625\",\"mailingRegion\":\"NY\",\"mobileNumber\":\"+15859876543\",\"mobile"
                + "NumberCountry\":\"US\",\"occupationTitle\":\"TESTER\",\"occupationType\":\"GOVER"
                + "NMENT\",\"phoneNumber\":\"+15859876543\",\"phoneNumberCountry\":\"US\",\"postalC"
                + "ode\":\"14514\",\"programUserId\":\"Kaylee.Howe8\",\"region\":\"NY\",\"taxReside"
                + "ntStatus\":\"YES\",\"userType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/users/user-91acd009-36d5-40d9-b8b1-39a3704b577e"
                + "\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Retrieve a single [user](page:resources/user) record by user token. .
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRetrieveUser1() throws Exception {
        // Parameters for the API call
        String userToken = 
                "user-2bbfc967-d12e-4647-a887-d905172fb4bc";

        // Set callback and perform API call
        UserResult result = null;
        try {
            result = controller.retrieveUser(userToken);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"token\":\"user-91acd009-36d5-40d9-b8b1-39a3704b577e\",\"addressLine1\":\"4179 B"
                + "UFFALO ROAD\",\"businessAddressLine1\":\"99 Office Park\",\"businessAddressLine2"
                + "\":\"Suite 293\",\"businessAddressType\":\"BUSINESS\",\"businessCity\":\"Modesto"
                + "\",\"businessContactRole\":\"OTHER\",\"businessCountry\":\"US\",\"businessName"
                + "\":\"Api V2 Company LLC\",\"businessPostalCode\":\"99700\",\"businessRegion\":"
                + "\"CA\",\"city\":\"NORTH CHILI\",\"country\":\"US\",\"countryOfBirth\":\"US\",\"c"
                + "ountryOfNationality\":\"US\",\"createdOn\":\"2022-04-08T19:44:16Z\",\"currency"
                + "\":\"USD\",\"dateOfBirth\":\"1991-04-13T00:00:00Z\",\"email\":\"PQTESTEMAIL+Eman"
                + "uel_Carroll@GMAIL.COM\",\"employerId\":\"1\",\"firstName\":\"Timothy\",\"gender"
                + "\":\"MALE\",\"governmentId\":\"111111111\",\"governmentIdType\":\"SSN\",\"langua"
                + "ge\":\"en-US\",\"lastName\":\"Mueller\",\"mailingAddressLine1\":\"128 Maple Lane"
                + "\",\"mailingCity\":\"Rochester\",\"mailingCountry\":\"US\",\"mailingPostalCode"
                + "\":\"14625\",\"mailingRegion\":\"NY\",\"mobileNumber\":\"+15859876543\",\"mobile"
                + "NumberCountry\":\"US\",\"occupationTitle\":\"TESTER\",\"occupationType\":\"GOVER"
                + "NMENT\",\"phoneNumber\":\"+15859876543\",\"phoneNumberCountry\":\"US\",\"postalC"
                + "ode\":\"14514\",\"programUserId\":\"Kaylee.Howe8\",\"region\":\"NY\",\"taxReside"
                + "ntStatus\":\"YES\",\"userType\":\"INDIVIDUAL\",\"links\":[{\"href\":\"https://ap"
                + "i.sandbox.payquicker.io/api/v2/users/user-91acd009-36d5-40d9-b8b1-39a3704b577e"
                + "\",\"params\":{\"rel\":\"self\"}}],\"meta\":{\"timezone\":\"GMT\",\"requestRef"
                + "\":\"request-reference-value\"}}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
