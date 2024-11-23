package com.muhammet.dogruyapi;

import java.util.List;

public interface Repository {
    /**
     * KURALLAR
     * 1- Erişim belirteçleri kullanılmaz
     * 2- Methodlar tanım olarak verilir.
     * 3- Methodların gövdeleri yazılmaz. (İstisnaları vardır.)
     */
    void save(Object object);

    void update(Object object);

    void delete(Long id);

    Object findById(Long id);

    List<Object> findAll();


}
