//package controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.stackroute.controller.PdfController;
//import com.stackroute.service.PdfExtractionService;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//
////@RunWith(MockitoJUnitRunner.class)
//public class PdfControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    public PdfExtractionService pdfExtractionService;
//
//    @InjectMocks
//    private PdfController pdfController;
//
//    @Before
//    public void setUp()
//    {
//        MockitoAnnotations.initMocks(this);
//        mockMvc = MockMvcBuilders.standaloneSetup(pdfController).build();
//        pdfExtractionService= org.mockito.Mockito.mock(PdfExtractionService.class);
//
//    }
//
//    @Test
//    public void getDocument() throws Exception
//    {
//        when(pdfExtractionService.extractFromFile(anyString())).thenReturn(anyString());
//        mockMvc.perform(MockMvcRequestBuilders.get("/files/pdf-sample.pdf")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(anyString())))
//                .andExpect(MockMvcResultMatchers.status().isConflict())
//                .andDo(MockMvcResultHandlers.print());
//
//    }
//
//    @Test
//    public void getDocumentFailure() throws Exception
//    {
//           when(pdfExtractionService.extractFromFile(anyString())).thenThrow(new NullPointerException());
//           mockMvc.perform(MockMvcRequestBuilders.get("files/pdf-sample1.pdf")
//                .contentType(MediaType.APPLICATION_JSON).content(asJsonString(anyString())))
//                .andExpect(MockMvcResultMatchers.status().isNotFound())
//                .andDo(MockMvcResultHandlers.print());
//    }
//
//    private static String asJsonString(final Object obj)
//    {
//        try{
//            return new ObjectMapper().writeValueAsString(obj);
//
//        }catch(Exception e){
//            throw new RuntimeException(e);
//        }
//    }
//
//}
