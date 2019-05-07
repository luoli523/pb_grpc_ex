package luoli523.grpc.proto;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import luoli523.grpc.proto.AddressBookProtos.AddressBook;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AddressbookTest {

  AddressBook.Builder addressbook = AddressBook.newBuilder();

  @Before
  public void parseAddressbook() throws IOException {
    JsonFactory factory = new JsonFactory();
    JsonParser jp = factory.createParser(new File("addressbookTest.json"))
  }

  @Test
  public void testAddressbook() {

  }

}