package org.ags.resource;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;
import org.ags.model.EmailRequest;
import org.ags.service.EmailService;
import org.ags.service.ItemService;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("email")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmailResource {

    @Inject
    EmailService emailService;

    @Path("default")
    @POST
    public EmailRequest create(EmailRequest email){
        return email;
    }

    @POST
    public MailjetResponse sendEmail(EmailRequest email) throws MailjetException {
        return
            emailService.sendEmail(email,"Subject isi disini","content isi disini");
    }
}
