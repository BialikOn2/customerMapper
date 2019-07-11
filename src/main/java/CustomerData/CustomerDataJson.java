package CustomerData;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import java.io.IOException;

public class CustomerDataJson {
    static final Logger logger = Logger.getLogger(CustomerDataJson.class);
    public static void main(String[] args) throws IOException {

        CustomerDataDetails customer_data= CustomerDataInput.DefaultInput();

        ObjectMapper mapper = new ObjectMapper();
        String customer_dataAsString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customer_data);
        logger.info(customer_dataAsString);
    }

    public static class CustomerDataInput {
        public static CustomerDataDetails DefaultInput() {
            CustomerDataDetails cdd= new CustomerDataDetails();
            cdd.setFirstName("David");
            cdd.setLastName("Bialik");
            cdd.setAge(34);
            cdd.setAddress("27th Washington BLVD","Tel-Aviv",6608614);
            cdd.setPhoneNumbers("Mobile","054-7440455");
            return cdd;
        }
    }
}
