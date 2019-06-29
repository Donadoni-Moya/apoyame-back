package pe.com.unmsm.sgojp.api.dao.impl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import pe.com.unmsm.sgojp.api.dao.OpinionDAO;
import pe.com.unmsm.sgojp.api.model.service.Opinion;

/**
 *
 * @author Miguel
 */
public class OpinionDAOImpl implements OpinionDAO {



    @Override
    public boolean register(Opinion e) {
        return true;
    }

    @Override
    public boolean update(Opinion e) {
        return true;

    }

    @Override
    public Opinion get(String id) {
        return null;
    }

    @Override
    public List<Opinion> getAll() {
        return null;
    }

    @Override
    public boolean remove(String id) {
        return true;
    }

    public static void main(String[] args) {

    }

}
