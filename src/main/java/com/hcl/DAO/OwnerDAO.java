package com.hcl.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.beans.Owner;
import com.hcl.beans.Resturant;
@Repository
public interface OwnerDAO  extends JpaRepository<Owner, Integer>{

}
