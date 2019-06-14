package tr.com.innova.lega.demo.presentation;

import lombok.Getter;
import lombok.Setter;
import tr.com.innova.lega.demo.domain.kisi.Kisi;

@Getter
@Setter
public class KisiDTO {
    private String ad;
    private String soyad;

    public static KisiDTO mapFromKisi(Kisi kisi) {
        KisiDTO kisiDTO = null;
        if (kisi != null) {
            kisiDTO = new KisiDTO();
            kisiDTO.setAd(kisi.getAd());
            kisiDTO.setSoyad(kisi.getSoyad());
        }
        return kisiDTO;
    }
}
