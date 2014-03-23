package com.engagepoint.university.inetStore.controller;

import com.engagepoint.university.inetStore.dto.MobileDTO;
import com.engagepoint.university.inetStore.service.repository.MobileService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class MobileController implements Serializable {

    @Inject
    MobileService mobileService;

    private List<MobileDTO> mobileDTOs;

    public List<MobileDTO> getMobileDTOs() {
        return mobileService.getAll();
    }

    public void addMobile() {
        MobileDTO mobileDTO1 = new MobileDTO();
        mobileDTO1.setBrand("NOKIA");
        mobileDTO1.setModel("Asha 500 Dual Sim Red");
        mobileDTO1.setOptions("Экран 2.8 (320 х 240, сенсорный)\n"
                + "моноблок камера 2 Мп\n"
                + "Bluetooth 3.0 поддержка microSD \n"
                + "FM-радио / поддержка 2х СИМ-карт \n"
                + "разъем 3.5 мм / 100.3 х 58.1 х 12.8 мм, 101.3 г");
        mobileDTO1.setPrice(300);
        mobileDTO1.setImage("nokia_asha_500");
        mobileDTO1.setNumber(3);
        mobileService.save(mobileDTO1);

        MobileDTO mobileDTO2 = new MobileDTO();
        mobileDTO2.setBrand("IPhone");
        mobileDTO2.setModel("5S");
        mobileDTO2.setOptions("Дисплей Retina\n" +
                "Широкоформатный дисплей Multi-Touch с диагональю 4 дюйма\n" +
                "Разрешение 1136 x 640 пикселей (326 пикселя/дюйм)\n" +
                "Контрастность 800:1 (стандартная)\n" +
                "Яркость до 500 кд/м2 (стандартная)\n" +
                "Олеофобное покрытие, устойчивое к появлению отпечатков пальцев, на передней панели\n" +
                "Поддержка одновременного отображения нескольких языков и наборов символов");
        mobileDTO2.setPrice(800);
        mobileDTO2.setImage("iphone5");
        mobileDTO2.setNumber(2);
        mobileService.save(mobileDTO2);

        MobileDTO mobileDTO3 = new MobileDTO();
        mobileDTO3.setBrand("Samsung");
        mobileDTO3.setModel("Galaxy");
        mobileDTO3.setOptions("Экран (1920x1080 FullHD Super AMOLED, сенсорный)\n" +
                "моноблок / Exynos 5410 Octa 1.6 ГГц / камера 13 Мп / Bluetooth 4.0 \n" +
                "Wi-Fi / NFC / ИК-порт / RAM 2 ГБ / 16 ГБ встроенной памяти + поддержка microSD \n" +
                "разъем 3.5 мм / GLONASS / OC Android 4.2 (Jelly Bean) / 136.6 x 69.8 x 7.9 мм, 130 г / черный");
        mobileDTO3.setPrice(700);
        mobileDTO3.setImage("samsung_galaxy");
        mobileDTO3.setNumber(4);
        mobileService.save(mobileDTO3);
    }

}

