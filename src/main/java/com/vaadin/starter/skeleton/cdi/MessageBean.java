package com.vaadin.starter.skeleton.cdi;

import com.wcs.vaadin.flow.cdi.NormalUIScoped;

/**
 * Data provider bean.
 */
@NormalUIScoped
public class MessageBean {

    /**
     * Gets message data.
     *
     * @return a message
     */
    public String getMessage() {
        return "Not Clicked";
    }
}
