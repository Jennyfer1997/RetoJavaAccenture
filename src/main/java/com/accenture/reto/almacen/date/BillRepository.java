package com.accenture.reto.almacen.date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.reto.almacen.entitys.Bill;

public interface BillRepository extends JpaRepository<Bill, Integer>{

}
