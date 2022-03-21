package se.lexicon.thymeleafcontacttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import se.lexicon.thymeleafcontacttest.model.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ContactController {

    List<Contact> contactList;

    public ContactController(List<Contact> contactList) {
        this.contactList = new ArrayList<>(
                Arrays.asList(
                        new Contact("First name", 123, "the first person"),
                        new Contact("Second", 234, "the second one")
                )
        );
    }

    @GetMapping("/contacts")
    public String showContactsView(Model model) {

        model.addAttribute("contactItems", contactList);
        return "contacts";
    }

    @GetMapping("/contacts/add")
    public String getContactsForm() { return "contact-form";}

    @PostMapping("/contacts/process")
    public String processContactForm(String name, int number, String info) {
        Contact contact = new Contact(name, number, info);
        contactList.add(contact);

        return "redirect:/contacts";

    }

}
