package com.engagepoint.university.inetStore.controller;


import com.engagepoint.university.inetStore.dto.MobileDTO;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MobileContentController implements Serializable{
    private MobileDTO selectedMobile;

    public MobileDTO getSelectedMobile() {
        return selectedMobile;
    }

    public void setSelectedMobile(MobileDTO selectedMobile) {
        this.selectedMobile = selectedMobile;
    }
}
