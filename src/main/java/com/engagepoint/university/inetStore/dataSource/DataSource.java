package com.engagepoint.university.inetStore.dataSource;

import com.engagepoint.university.inetStore.entity.Mobile;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class DataSource implements Serializable {

    private int id = 0;

    private List<Mobile> mobiles= new ArrayList<>();

    @PostConstruct
    private void init() {
        Mobile mobile1 = new Mobile();
        setId();
        mobile1.setId(getId());
        mobile1.setBrand("NOKIA");
        mobile1.setModel("Asha 500 Dual Sim Red");
        mobile1.setOptions("Экран 2.8 (320 х 240, сенсорный)\n"
                + "моноблок камера 2 Мп\n"
                + "Bluetooth 3.0 поддержка microSD \n"
                + "FM-радио / поддержка 2х СИМ-карт \n"
                + "разъем 3.5 мм / 100.3 х 58.1 х 12.8 мм, 101.3 г");
        mobile1.setPrice(300);
        mobile1.setImage("nokia_asha_500");
        mobile1.setNumber(3);
        mobiles.add(mobile1);

        Mobile mobile2 = new Mobile();
        setId();
        mobile2.setId(getId());
        mobile2.setBrand("IPhone");
        mobile2.setModel("5S");
        mobile2.setOptions("Дисплей Retina\n" +
                "Широкоформатный дисплей Multi-Touch с диагональю 4 дюйма\n" +
                "Разрешение 1136 x 640 пикселей (326 пикселя/дюйм)\n" +
                "Контрастность 800:1 (стандартная)\n" +
                "Яркость до 500 кд/м2 (стандартная)\n" +
                "Олеофобное покрытие, устойчивое к появлению отпечатков пальцев, на передней панели\n" +
                "Поддержка одновременного отображения нескольких языков и наборов символов");
        mobile2.setPrice(800);
        mobile2.setImage("iphone5");
        mobile2.setNumber(2);
        mobiles.add(mobile2);

        Mobile mobile3 = new Mobile();
        setId();
        mobile3.setId(getId());
        mobile3.setBrand("Samsung");
        mobile3.setModel("Galaxy");
        mobile3.setOptions("Экран (1920x1080 FullHD Super AMOLED, сенсорный)\n" +
                "моноблок / Exynos 5410 Octa 1.6 ГГц / камера 13 Мп / Bluetooth 4.0 \n" +
                "Wi-Fi / NFC / ИК-порт / RAM 2 ГБ / 16 ГБ встроенной памяти + поддержка microSD \n" +
                "разъем 3.5 мм / GLONASS / OC Android 4.2 (Jelly Bean) / 136.6 x 69.8 x 7.9 мм, 130 г / черный");
        mobile3.setPrice(700);
        mobile3.setImage("samsung_galaxy");
        mobile3.setNumber(4);
        mobiles.add(mobile3);
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id+1;
    }
}
