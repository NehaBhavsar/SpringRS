package net.pb.web;

import java.util.ArrayList;
import java.util.List;

import net.pb.model.Contact;
import net.pb.model.Contacts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="contact")
public class ContactController {

	@RequestMapping(value="/listdata",method=RequestMethod.GET)
	@ResponseBody
	public Contacts listData(){
		System.out.println(" -- Inside List Contact Data --- ");
		Contact c = new Contact();
		c.setId(1l);
		c.setFirstName("paresh");
		c.setLastName("bhavsar");
		
		Contact c1 = new Contact();
		c1.setId(2l);
		c1.setFirstName("paresh-1");
		c1.setLastName("bhavsar-1");
		
		List<Contact> list = new ArrayList<Contact>();
		list.add(c);
		list.add(c1);
		
		Contacts clist = new Contacts();
		clist.setContacts(list);
//		return "rssfeedtemplate";
		return clist;
		
	}
	
	
	
}
