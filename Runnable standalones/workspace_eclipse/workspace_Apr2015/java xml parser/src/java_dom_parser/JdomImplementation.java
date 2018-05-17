package java_dom_parser;


public class JdomImplementation {

 public static void main(String[] args) {
  
  // read xml from a file
  ReadXml readXml = new ReadXml();
  readXml.getXml();
  
  // write xml to a file
  CreateXml createXml = new CreateXml();
  createXml.createXml();
 }
}

