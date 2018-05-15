package com.mounika.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeadLibraryImpl implements HeadLibrary {
		@RequestMapping("/getBook")
		@ResponseBody
		
		public String getBookTitle() {

			return "The Completer Reference to Java";
		}
	


}
