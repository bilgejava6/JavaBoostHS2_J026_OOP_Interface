package com.muhammet;

import com.muhammet.dogruyapi.Repository;
import com.muhammet.dogruyapi.repository.MusteriRepository;
import com.muhammet.dogruyapi.repository.SepetRepository;
import com.muhammet.dogruyapi.repository.UrunRepository;

public class Runner {
    public static void main(String[] args) {
        /**
         * Interface
         * 1- Sözleşmedir. kurallar bütününe reiayet edilebilmesi için bir şablon hazırlanır
         * ve bu sözleşmeyi kullananlar kurallara uymak zorunda kalırlar.
         * 2- NAsıl ki bir sözleşme içinde .... şeklinde boşluklar var ise interface içinde de
         * doldurulması gereken alanlar boş bırakılır. YAni methodlar genel hatları ile
         * tanımlanır gövdeleri yazılmaz.
         * ------------
         * NOT!!!!
         * interface ler miras alındıkları için miras alan sınıfların referanslarını taşıyabilirler.
         */
        MusteriRepository musteriRepository  = new MusteriRepository();
        SepetRepository sepetRepository = new SepetRepository();
        UrunRepository urunRepository = new UrunRepository();

        System.out.println("Müşteri Repository referansı....: "+ musteriRepository);
        System.out.println("Sepet Repository referansı....: "+ sepetRepository);
        System.out.println("Ürün Repository referansı....: "+ urunRepository);

        Repository repository;
        repository = musteriRepository;
        System.out.println("reposnitory....: "+ repository);
    }
}