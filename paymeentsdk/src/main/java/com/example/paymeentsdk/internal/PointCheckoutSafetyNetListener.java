/************************************************************************
 * Copyright PointCheckout, Ltd.
 */
package com.example.paymeentsdk.internal;

/**
 * @author pointcheckout
 */
public interface PointCheckoutSafetyNetListener {
    void callback(boolean valid, String message);
}
