package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DAO.*;
import com.entity.*;
import com.form.*;

import java.sql.SQLException;
import java.util.List;

@Controller
public class MyControler {
    public MyControler() {}
    private IDAO dao;

    {
        try {
            dao = DAOFactory.getDAOInstance(TypeDAO.COLLECTION);
//            dao = DAOFactory.getDAOInstance(TypeDAO.MySQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @RequestMapping(value = {"/", "/sonata"}, method = { RequestMethod.GET, RequestMethod.POST })
    public String showAllSonata(Model model) {
        List<Sonata> list = dao.get_sonata();
        model.addAttribute("allSonata", list);
        return "sonataPage";
    }

    @RequestMapping(value = {"/addSonata"}, method = RequestMethod.GET)
    public String showAddSonataView(Model model) {
        AddSonataForm addSonataForm = new AddSonataForm();
        model.addAttribute("addSonataForm", addSonataForm);
        return "addSonataPage";
    }

    @RequestMapping(value = {"/addSonata"}, method = RequestMethod.POST)
    public String addSonata(Model model, AddSonataForm addSonataForm) {
        dao.add_sonata(new Sonata(addSonataForm.getSonata_id(), addSonataForm.getDuration(), addSonataForm.getOpuses_number(), addSonataForm.getCompositor(), addSonataForm.getPart_number(), addSonataForm.getApplication(), addSonataForm.getCell_id()));
        return "redirect:/sonata";
    }

    @RequestMapping(value = { "/deleteSonataById" }, method = RequestMethod.GET)
    public String showDeleteSonataView(Model model) {
        DeleteSonataForm deleteSonataForm = new DeleteSonataForm();
        model.addAttribute("deleteSonataForm", deleteSonataForm);
        return "deleteSonataByIdPage";
    }

    @RequestMapping(value = { "/deleteSonataById" }, method = RequestMethod.POST)
    public String deleteSonata(Model model, DeleteSonataForm deleteSonataForm) {
        dao.delete_sonata(deleteSonataForm.getSonata_id());
        return "redirect:/sonata";
    }

    @RequestMapping(value = { "/sonataById" }, method = RequestMethod.GET)
    public String showGetSonataView(Model model) {

        GetSonataForm getSonataForm = new GetSonataForm();

        model.addAttribute("getSonataForm", getSonataForm);

        return "getSonataPage";
    }

    @RequestMapping(value = { "/sonataById" }, method = RequestMethod.POST)
    public String getSonataById(Model model, GetSonataForm getSonataForm) {
        List<Sonata> list = dao.search_sonata(getSonataForm.getSonata_id());
        model.addAttribute("allSonata", list);
        return "sonataPage";
    }
}
