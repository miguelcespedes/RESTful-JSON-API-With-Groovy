@RestController
class RESTful {

	@RequestMapping("/")
	HashMap<String, Object> get() 
	{
		HashMap<String, Object> response = new HashMap<String, Object>();
		response.put("message", "OK");
		return response;

	}

}