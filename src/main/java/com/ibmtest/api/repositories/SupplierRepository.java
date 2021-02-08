package com.ibmtest.api.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ibmtest.api.models.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Integer> {

}
