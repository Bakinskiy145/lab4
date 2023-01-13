package org.evil.service;

import org.evil.domain.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/store")
public class JerseyRest {
    //store smartphone assortment
    private static Smartphone[] smartphoneData = {
            new Smartphone("1", "IPHONE", "13 PRO MAX", "red", 6, 512, 135999),
            new Smartphone("2", "POCO", "CLASS", "blue", 6, 128, 20720),
            new Smartphone("3", "SAMSUNG", "GALAXY S22", "violet", 8, 256, 68499),
            new Smartphone("4", "XIAOMI", "REDMI NOTE 10S", "black", 6, 128, 17499),
            new Smartphone("5,", "REALME ", "9 PRO+", "green", 8, 256, 3599)
    };
    // the number of products in the store
    private static int[] quantityData = {5, 5, 5, 5, 5};
    private static StoreAssortment storeAssortment = new StoreAssortment(smartphoneData, quantityData);

    /**
     * // EXAMPLE POST REQUEST
     *
     * POST http://localhost:8083/RestExample/rest/store/payment
     * Accept: application/json
     * Content-Type: application/json
     *
     * {
     *   "productId": "3",
     *   "quantity": 2
     * }
     *
     */

    @POST
    @Path("/payment")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response buySmartphone(UserOrder userOrder) {
        int size = storeAssortment.getSmartphones().length;
        for (int i = 0; i < size; i++) {
            Smartphone currentSmartphone = storeAssortment.getSmartphones()[i];
            if (currentSmartphone.getId().equals(userOrder.getProductId())) {
                double orderPrice = currentSmartphone.getPrice() * userOrder.getQuantity();
                PaymentResult goodResult = new PaymentResult(
                        currentSmartphone.toString(),
                        userOrder.getQuantity(),
                        orderPrice,
                        "Buy successful!");
                return Response.ok(goodResult).build();
            }
        }
        PaymentResult badResult = new PaymentResult(
                userOrder.getProductId(),
                userOrder.getQuantity(),
                0,
                "Buy failure! Model with id = " + userOrder.getProductId() + " not found");
        return Response.ok(badResult).build();
    }


    @GET
    @Path("/assortment")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStoreCatalog() {
        return Response.ok(storeAssortment).build();
    }
}
