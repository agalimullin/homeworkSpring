package hello;

import hello.dao.AlbumDAO;
import hello.dao.GroupDAO;
import hello.dao.SongDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class ControllerApp {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String admin() {
        return "admin";
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home() {
        return "admin";
    }

    @RequestMapping(value = "/addGroup", method = RequestMethod.GET)
    public String addNewGroup() {
        return "addGroup";
    }

    @RequestMapping(value = "/addAlbum", method = RequestMethod.GET)
    public String addNewAlbum() {
        return "addAlbum";
    }

    @RequestMapping(value = "/addSong", method = RequestMethod.GET)
    public String addNewSong() {
        return "addSong";
    }

    @RequestMapping(value = "/sendGroup", method = RequestMethod.POST)
    public String sendGroup(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("info") String info) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        GroupDAO groupDAO = (GroupDAO) ctx.getBean("groupDAO");
        Group group = new Group();
        group.setId(id);
        group.setName(name);
        group.setInfo(info);
        groupDAO.addGroup(group);
        return "redirect:home";
    }

    @RequestMapping(value = "/sendAlbum", method = RequestMethod.POST)
    public String sendAlbum(@RequestParam("name") String name, @RequestParam("groupID") int groupID, @RequestParam("id") int id) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        AlbumDAO albumDAO = (AlbumDAO) ctx.getBean("albumDAO");
        Album album = new Album();
        album.setName(name);
        album.setGroupID(groupID);
        album.setId(id);
        albumDAO.addAlbum(album);
        return "redirect:home";
    }

    @RequestMapping(value = "/sendSong", method = RequestMethod.POST)
    public String sendSong(@RequestParam("name") String name, @RequestParam("text") String text, @RequestParam("albumID") int albumID) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        SongDAO songDAO = (SongDAO) ctx.getBean("songDAO");
        Song song = new Song();
        song.setName(name);
        song.setText(text);
        song.setAlbumID(albumID);
        songDAO.addSong(song);
        return "redirect:home";
    }

    @RequestMapping(value = "/showGroups", method = RequestMethod.GET)
    public String showGroups(ModelMap model) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hello.xml");
        GroupDAO groupDAO = (GroupDAO) ctx.getBean("groupDAO");
        Group group = groupDAO.showGroups();
        model.addAttribute("name", group.getName());
        model.addAttribute("info", group.getInfo());
        return "showGroups";
    }

}