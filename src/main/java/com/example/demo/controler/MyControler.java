package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DAO.*;
import com.entity.*;
import com.form.*;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@Controller
public class MyControler {
    public MyControler() {}
    private IDAO dao;

    {
        try {
            dao = DAOFactory.getDAOInstance(TypeDAO.COLLECTION);
//            private IDAO dao = DAOFactory.getDAOInstance(TypeDAO.MySQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

//    @RequestMapping(value = { "/", "/aria" }, method = { RequestMethod.GET, RequestMethod.POST })
//    public String showAllAria(Model model) {
//        LinkedList<Aria> list = dao.get_aria();
//        model.addAttribute("allAria", list);
//        return "ariaPage";
//    }
//
//    @RequestMapping(value = {"/addAria"}, method = RequestMethod.GET)
//    public String showAddAriaView(Model model) {
//        AddAriaForm addAriaForm = new AddAriaForm();
//        model.addAttribute("addAriaForm", addAriaForm);
//        return "addAriaPage";
//    }
//
//    @RequestMapping(value = {"/addAria"}, method = RequestMethod.POST)
//    public String addAria(Model model, AddAriaForm addAriaForm) {
//        dao.add_aria(new Aria(addAriaForm.get_aria_id(), addAriaForm.get_duration(), addAriaForm.get_opuses_number(), addAriaForm.get_compositor(), addAriaForm.get_song_kind(), addAriaForm.get_singer(), addAriaForm.get_verses_number(), addAriaForm.get_volume(), addAriaForm.get_pace(), addAriaForm.get_intonation(), addAriaForm.get_cell_id()));
//        return "redirect:/aria";
//    }
//
//    @RequestMapping(value = { "/deleteAriaById" }, method = RequestMethod.GET)
//    public String showDeleteAriaView(Model model) {
//        DeleteAriaForm deleteAriaForm = new DeleteAriaForm();
//        model.addAttribute("deleteAriaForm", deleteAriaForm);
//        return "deleteAriaByIdPage";
//    }
//
//    @RequestMapping(value = { "/deleteAriaById" }, method = RequestMethod.POST)
//    public String deleteAria(Model model, DeleteAriaForm deleteAriaForm) {
//        dao.delete_aria(deleteAriaForm.get_aria_id());
//        return "redirect:/aria";
//    }
//
//    @RequestMapping(value = { "/ariaById" }, method = RequestMethod.GET)
//    public String showGetAriaView(Model model) {
//
//        GetAriaForm getAriaForm = new GetAriaForm();
//
//        model.addAttribute("getAriaForm", getAriaForm);
//
//        return "getAriaPage";
//    }
//
//    @RequestMapping(value = { "/ariaById" }, method = RequestMethod.POST)
//    public String getAriaById(Model model, GetAriaForm getAriaForm) {
//        List<Aria> list = dao.search_aria(getAriaForm.get_aria_id());
//        model.addAttribute("allAria", list);
//        return "ariaPage";
//    }

//    @RequestMapping(value = {"/", "/collection"}, method = { RequestMethod.GET, RequestMethod.POST })
//    public String showAllCollection(Model model) {
//        List<Collection> list = dao.get_collection();
//        model.addAttribute("allCollection", list);
//        return "collectionPage";
//    }
//
//    @RequestMapping(value = {"/", "/addCollection"}, method = RequestMethod.GET)
//    public String showAddCollectionView(Model model) {
//        AddCollectionForm addCollectionForm = new AddCollectionForm();
//        model.addAttribute("addCollectionForm", addCollectionForm);
//        return "addCollectionPage";
//    }
//
//    @RequestMapping(value = {"/addCollection"}, method = RequestMethod.POST)
//    public String addCollection(Model model, AddCollectionForm addCollectionForm) {
//        dao.add_collection(new Collection(addCollectionForm.get_collection_id(), addCollectionForm.get_name()));
//        return "redirect:/collection";
//    }
//
//    @RequestMapping(value = { "/deleteCollectionById" }, method = RequestMethod.GET)
//    public String showDeleteCollectionView(Model model) {
//        DeleteCollectionForm deleteCollectionForm = new DeleteCollectionForm();
//        model.addAttribute("deleteAriaForm", deleteCollectionForm);
//        return "deleteCollectionByIdPage";
//    }
//
//    @RequestMapping(value = { "/deleteCollectionById" }, method = RequestMethod.POST)
//    public String deleteCollection(Model model, DeleteCollectionForm deleteCollectionForm) {
//        dao.delete_collection(deleteCollectionForm.get_collection_id());
//        return "redirect:/collection";
//    }
//
//    @RequestMapping(value = { "/collectionByCollectionId" }, method = RequestMethod.GET)
//    public String showGetCollectionView(Model model) {
//
//        GetCollectionForm getCollectionForm = new GetCollectionForm();
//
//        model.addAttribute("getCollectionForm", getCollectionForm);
//
//        return "getCollectiionForm";
//    }
//
//    @RequestMapping(value = { "/collectionById" }, method = RequestMethod.POST)
//    public String getCollectionById(Model model, GetCollectionForm getCollectionForm) {
//        List<Collection> list = dao.search_collection(getCollectionForm.get_collection_id());
//        model.addAttribute("allCollection", list);
//        return "collectionPage";
//    }
//
//    @RequestMapping(value = {"/", "/cell"}, method = { RequestMethod.GET, RequestMethod.POST })
//    public String showAllCell(Model model) {
//        List<Cell> list = dao.get_cell();
//        model.addAttribute("allCell", list);
//        return "cellPage";
//    }
//
//    @RequestMapping(value = {"/", "/addCell"}, method = RequestMethod.GET)
//    public String showAddCellView(Model model) {
//        AddCellForm addCellForm = new AddCellForm();
//        model.addAttribute("addCellForm", addCellForm);
//        return "addCellPage";
//    }
//
//    @RequestMapping(value = {"/addCell"}, method = RequestMethod.POST)
//    public String addCell(Model model, AddCellForm addCellForm) {
//        dao.add_cell(new Cell(addCellForm.get_cell_id(), addCellForm.get_copies_number(), addCellForm.get_collection_id()));
//        return "redirect:/cell";
//    }
//
//    @RequestMapping(value = { "/deleteCellById" }, method = RequestMethod.GET)
//    public String showDeleteCellView(Model model) {
//        DeleteCellForm deleteCellForm = new DeleteCellForm();
//        model.addAttribute("deleteCellForm", deleteCellForm);
//        return "deleteCellByIdPage";
//    }
//
//    @RequestMapping(value = { "/deleteCellById" }, method = RequestMethod.POST)
//    public String deleteCell(Model model, DeleteCellForm deleteCellForm) {
//        dao.delete_cell(deleteCellForm.get_cell_id());
//        return "redirect:/cell";
//    }
//
//    @RequestMapping(value = { "/cellByCellId" }, method = RequestMethod.GET)
//    public String showGetCellView(Model model) {
//
//        GetCellForm getCellForm = new GetCellForm();
//
//        model.addAttribute("getCellForm", getCellForm);
//
//        return "getCellForm";
//    }
//
//    @RequestMapping(value = { "/cellById" }, method = RequestMethod.POST)
//    public String getCellById(Model model, GetCellForm getCellForm) {
//        List<Cell> list = dao.search_cell(getCellForm.get_cell_id());
//        model.addAttribute("allCell", list);
//        return "cellPage";
//    }
//
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
