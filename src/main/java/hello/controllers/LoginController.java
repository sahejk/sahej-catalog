package hello.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

  @RequestMapping(value = "/v1/cc-reward-redemption/categories", method = RequestMethod.GET)
  public ResponseEntity<String> categories() {
    return new ResponseEntity<>("{\n" +
      "    \"status\": {\n" +
      "        \"code\": \"1000\",\n" +
      "        \"description\": \"description\"\n" +
      "    },\n" +
      "    \"data\": {\n" +
      "        \"categories\": [\n" +
      "            {\n" +
      "                \"id\": 1,\n" +
      "                \"name\": \"Health\",\n" +
      "                \"description\": \"category description\",\n" +
      "                \"priority\": 1,\n" +
      "                \"activated\": true,\n" +
      "\t\t\"imageURL\": \"https://res.cloudinary.com/dh8cnckcf/image/upload/v1503314778/catalogue/HEALTH.png\",\n" +
      "                \"code\": \"HEALTH\",\n" +
      "                \"lastUpdated\": {\n" +
      "                    \"hour\": 13,\n" +
      "                    \"minute\": 52,\n" +
      "                    \"second\": 15,\n" +
      "                    \"nano\": 430000000,\n" +
      "                    \"dayOfYear\": 229,\n" +
      "                    \"dayOfWeek\": \"THURSDAY\",\n" +
      "                    \"month\": \"AUGUST\",\n" +
      "                    \"dayOfMonth\": 17,\n" +
      "                    \"year\": 2017,\n" +
      "                    \"monthValue\": 8,\n" +
      "                    \"chronology\": {\n" +
      "                        \"id\": \"ISO\",\n" +
      "                        \"calendarType\": \"iso8601\"\n" +
      "                    }\n" +
      "                }\n" +
      "            },\n" +
      "            {\n" +
      "                \"id\": 2,\n" +
      "                \"name\": \"Travel\",\n" +
      "                \"description\": \"category description\",\n" +
      "                \"priority\": 2,\n" +
      "                \"activated\": true,\n" +
      "\t\t\"imageURL\": \"https://res.cloudinary.com/dh8cnckcf/image/upload/v1503314778/catalogue/TRAVEL.png\",\n" +
      "                \"code\": \"TRAVEL\",\n" +
      "                \"lastUpdated\": {\n" +
      "                    \"hour\": 13,\n" +
      "                    \"minute\": 52,\n" +
      "                    \"second\": 15,\n" +
      "                    \"nano\": 430000000,\n" +
      "                    \"dayOfYear\": 229,\n" +
      "                    \"dayOfWeek\": \"THURSDAY\",\n" +
      "                    \"month\": \"AUGUST\",\n" +
      "                    \"dayOfMonth\": 17,\n" +
      "                    \"year\": 2017,\n" +
      "                    \"monthValue\": 8,\n" +
      "                    \"chronology\": {\n" +
      "                        \"id\": \"ISO\",\n" +
      "                        \"calendarType\": \"iso8601\"\n" +
      "                    }\n" +
      "                }\n" +
      "            },\n" +
      "            {\n" +
      "                \"id\": 4,\n" +
      "                \"name\": \"Voucher\",\n" +
      "\t\t\"imageURL\": \"https://res.cloudinary.com/dh8cnckcf/image/upload/v1503314778/catalogue/VOUCHER.png\",\n" +
      "                \"description\": \"category description\",\n" +
      "                \"priority\": 4,\n" +
      "                \"activated\": true,\n" +
      "                \"code\": \"VOUCHER\",\n" +
      "                \"lastUpdated\": {\n" +
      "                    \"hour\": 13,\n" +
      "                    \"minute\": 52,\n" +
      "                    \"second\": 15,\n" +
      "                    \"nano\": 430000000,\n" +
      "                    \"dayOfYear\": 229,\n" +
      "                    \"dayOfWeek\": \"THURSDAY\",\n" +
      "                    \"month\": \"AUGUST\",\n" +
      "                    \"dayOfMonth\": 17,\n" +
      "                    \"year\": 2017,\n" +
      "                    \"monthValue\": 8,\n" +
      "                    \"chronology\": {\n" +
      "                        \"id\": \"ISO\",\n" +
      "                        \"calendarType\": \"iso8601\"\n" +
      "                    }\n" +
      "                }\n" +
      "            },\n" +
      "            {\n" +
      "                \"id\": 5,\n" +
      "\t\t\"imageURL\": \"https://res.cloudinary.com/dh8cnckcf/image/upload/v1503307846/catalogue/TOY.png\",\n" +
      "                \"name\": \"KIDS AND TOY\",\n" +
      "                \"description\": \"category description\",\n" +
      "                \"priority\": 4,\n" +
      "                \"activated\": true,\n" +
      "                \"code\": \"TOY\",\n" +
      "                \"lastUpdated\": {\n" +
      "                    \"hour\": 13,\n" +
      "                    \"minute\": 52,\n" +
      "                    \"second\": 15,\n" +
      "                    \"nano\": 430000000,\n" +
      "                    \"dayOfYear\": 229,\n" +
      "                    \"dayOfWeek\": \"THURSDAY\",\n" +
      "                    \"month\": \"AUGUST\",\n" +
      "                    \"dayOfMonth\": 17,\n" +
      "                    \"year\": 2017,\n" +
      "                    \"monthValue\": 8,\n" +
      "                    \"chronology\": {\n" +
      "                        \"id\": \"ISO\",\n" +
      "                        \"calendarType\": \"iso8601\"\n" +
      "                    }\n" +
      "                }\n" +
      "            },\n" +
      "            {\n" +
      "                \"id\": 3,\n" +
      "\t\t\"imageURL\": \"https://res.cloudinary.com/dh8cnckcf/image/upload/v1503314778/catalogue/HOUSE_APPLIANCE.png\",\n" +
      "                \"name\": \"House Appliance\",\n" +
      "                \"description\": \"category description\",\n" +
      "                \"priority\": 5,\n" +
      "                \"activated\": true,\n" +
      "                \"code\": \"HOUSE_APPLIANCE\",\n" +
      "                \"lastUpdated\": {\n" +
      "                    \"hour\": 13,\n" +
      "                    \"minute\": 52,\n" +
      "                    \"second\": 15,\n" +
      "                    \"nano\": 430000000,\n" +
      "                    \"dayOfYear\": 229,\n" +
      "                    \"dayOfWeek\": \"THURSDAY\",\n" +
      "                    \"month\": \"AUGUST\",\n" +
      "                    \"dayOfMonth\": 17,\n" +
      "                    \"year\": 2017,\n" +
      "                    \"monthValue\": 8,\n" +
      "                    \"chronology\": {\n" +
      "                        \"id\": \"ISO\",\n" +
      "                        \"calendarType\": \"iso8601\"\n" +
      "                    }\n" +
      "                }\n" +
      "            }\n" +
      "        ]\n" +
      "    }\n" +
      "}", HttpStatus.OK);
  }
  @RequestMapping(value = "/v3/creditcards/summary", method = RequestMethod.POST)
  public ResponseEntity<String> creditCards() {
    return new ResponseEntity<>("{\"status\":{\"code\":\"1000\",\"description\":\"Success\"},\"cardList\":[{\"status\":{\"code\":\"1000\",\"description\":\"Success\"},\"sortSequence\":0,\"productType\":{\"code\":\"VSAPLS\",\"description\":\"Sansiri Platinum \"},\"cardStatus\":{\"code\":\"normal\",\"description\":\"Normal Card\"},\"stmtDueDate\":\"2017-08-11T00:00:00.000+07:00\",\"lastPaymentDate\":\"2017-08-11T00:00:00.000+07:00\",\"currency\":\"764\",\"paymentStatus\":{\"code\":\"UNPAID\",\"description\":\"UNPAID\"},\"paymentAmount\":0.00,\"cardRefNo\":\"4773769908949262\",\"creditcardimageURL\":\"/creditcard/Visa/VSAPLS.png\",\"referenceName\":\"Accenture-Fa EASY60\",\"stmtDueAmount\":3111,\"creditUsed\":3111,\"stmtMinDueAmount\":500,\"creditLimit\":500000,\"availableCredit\":496889,\"currentDueAmount\":3111.00}]}", HttpStatus.OK);
  }
  @RequestMapping(value = "/v1/creditcards/rewards", method = RequestMethod.POST)
  public ResponseEntity<String> creditCardRewards() {
    return new ResponseEntity<>("{\"status\":{\"code\":\"1000\",\"description\":\"Success\"},\"cardRefNo\":\"4773769908949262\",\"rewardPoints\":100000}", HttpStatus.OK);
  }
  @RequestMapping(value = "/v3/login/preloadcheck", method = RequestMethod.POST)
  public ResponseEntity<String> login() {
    return new ResponseEntity<>("{\"status\":{\"code\":1000,\"description\":\"Success\"},\"data\":{\"language\":\"en\",\"tcAcceptVersion\":2,\"titleTH\":\"???\",\"nameTH\":\"????????????\",\"middleNameTH\":\"\",\"lastNameTH\":\"????????\",\"titleEN\":\"MR.\",\"nameEN\":\"CITIZENXIII\",\"middleNameEN\":\"\",\"lastNameEN\":\"ONLY\",\"profilePhotoPath\":\"/media/images/7990cc76ea6f49a29bd8626b1b73da3c\",\"staticTiles\":[{\"tileId\":901,\"sortSequence\":1,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"WEBVIEW\",\"tileNameEN\":\"Easy Bonus\",\"tileNameTH\":\"สิทธิพิเศษอีซี่โบนัส\",\"imageURL\":\"/lifestyle/partner/1.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"L\",\"tileFontColor\":\"FakeWhite\",\"data\":{\"URL\":\"http://fasteasy.scbeasy.com:8463/buzzebees/home.aspx?hash=8D1019BEDC017F840E91E24A4D12BFDBD8D667D5AE49A78F20B73FBA803F95D8\"}},{\"tileId\":902,\"sortSequence\":2,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"WEBVIEW\",\"tileNameEN\":\"Card deals\",\"tileNameTH\":\"โปรโมชั่นบัตร\",\"imageURL\":\"/lifestyle/partner/2.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"S\",\"tileFontColor\":\"FakeWhite\",\"data\":{\"URL\":\"https://scbprime.scb.co.th/th/promotion-creditcard\"}},{\"tileId\":903,\"sortSequence\":3,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"WEBVIEW\",\"tileNameEN\":\"Dining\",\"tileNameTH\":\"ค้นหาร้านอร่อย\",\"imageURL\":\"/lifestyle/partner/3.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"M\",\"tileFontColor\":\"FakeWhite\",\"data\":{\"URL\":\"https://pdev.wongnai.com/l/scb-easy\"}},{\"tileId\":904,\"sortSequence\":4,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"FUNCTION\",\"tileNameEN\":\"Register PromptPay\",\"tileNameTH\":\"สมัครพร้อมเพย์\",\"imageURL\":\"/lifestyle/partner/4.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"L\",\"tileFontColor\":\"FakeBlack\",\"data\":{\"functionId\":\"2\"}},{\"tileId\":905,\"sortSequence\":5,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"FUNCTION\",\"tileNameEN\":\"Donation\",\"tileNameTH\":\"บริจาค\",\"imageURL\":\"/lifestyle/partner/5.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"M\",\"tileFontColor\":\"FakeBlack\",\"data\":{\"functionId\":\"10\"}},{\"tileId\":906,\"sortSequence\":6,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"FUNCTION\",\"tileNameEN\":\"Contact us\",\"tileNameTH\":\"ติดต่อเรา\",\"imageURL\":\"/lifestyle/partner/6.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"S\",\"tileFontColor\":\"FakeWhite\",\"data\":{\"functionId\":\"11\"}}],\"versionAvailable\":{\"android\":\"3.0.1/165\",\"iOS\":\"3.4.7/315\",\"androidUrl\":\"https://play.google.com/store/apps/details?id=com.scb.phone&hl=th\",\"iOSUrl\":\"https://itunes.apple.com/th/app/scb-easy/id568388474?mt=8\"}}}", HttpStatus.OK);
  }
  @RequestMapping(value = "/v2/profiles/accounts/registered", method = RequestMethod.GET)
  public ResponseEntity<String> accounts() {
    return new ResponseEntity<>("{\"status\":{\"code\":\"1000\",\"description\":\"Success\"},\"depositList\":[{\"sortSequence\":0,\"nickname\":\"Name\",\"accountNo\":\"0062900212\",\"productType\":{\"code\":\"2\",\"description\":\"Savings\"},\"quickBalanceFlag\":\"0\",\"quickPromptpayFlag\":\"1\"},{\"sortSequence\":1,\"nickname\":\"Nick\",\"accountNo\":\"0062893318\",\"productType\":{\"code\":\"2\",\"description\":\"Savings\"},\"quickBalanceFlag\":\"0\",\"quickPromptpayFlag\":\"0\"},{\"sortSequence\":2,\"nickname\":\"\",\"accountNo\":\"0062907117\",\"productType\":{\"code\":\"2\",\"description\":\"Savings\"},\"quickBalanceFlag\":\"0\",\"quickPromptpayFlag\":\"0\"},{\"sortSequence\":3,\"nickname\":\"\",\"accountNo\":\"4689900736\",\"productType\":{\"code\":\"3\",\"description\":\"Current\"},\"quickBalanceFlag\":\"0\",\"quickPromptpayFlag\":\"0\"},{\"sortSequence\":4,\"nickname\":\"\",\"accountNo\":\"4619900277\",\"productType\":{\"code\":\"1\",\"description\":\"Fixed\"},\"quickBalanceFlag\":\"0\",\"quickPromptpayFlag\":\"0\"}],\"cardList\":[{\"sortSequence\":0,\"nickname\":\"\",\"cardRefNo\":\"4773769908949262\",\"cardType\":{\"code\":\"CC\",\"description\":\"Credit Card\"},\"productType\":{\"code\":\"CC\",\"description\":\"Credit Card\"},\"cardMask\":\"477376XXXXXX2878\"}],\"loanList\":[{\"sortSequence\":0,\"nickname\":\"\",\"accountNo\":\"47890071043\",\"loanType\":{\"code\":\"31\",\"description\":\"Mortgage Loan\"},\"accountStatus\":null}],\"clientList\":[]}", HttpStatus.OK);
  }
  @RequestMapping(value = "/v2/login", method = RequestMethod.POST)
  public ResponseEntity<String> loginV2() {
    HttpHeaders headers = new HttpHeaders();
//    Headers ["Api-Refresh": "9640ac70-8534-485e-b1f8-0e91778e698b", "Content-Length": "479", "channelid": "ENET", "Access-Control-Expose-Headers": "Api-Auth,Api-Refresh", "correlationid": "5e64e842-c849-4f5d-94d6-5289104b8b57", "expiration_at": "1503139397", "Content-Type": "application/json;charset=UTF-8", "Connection": "keep-alive", "X-Application-Context": "zuul-server:dev4:7001", "Accept-Language": "en", "Api-Auth": "9bba44f7-28a5-4be5-b278-2f8019ed65dd", "Server": "SCB", "Content-Encoding": "gzip", "Date": "Sat, 19 Aug 2017 09:43:16 GMT"]
    headers.add("Api-Auth","9bba44f7-28a5-4be5-b278-2f8019ed65dd");
    headers.add("expiration_at","1503139397");
    headers.add("correlationid","5e64e842-c849-4f5d-94d6-5289104b8b57");
    headers.add("Api-Refresh","9640ac70-8534-485e-b1f8-0e91778e698b");
    ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("{\"status\":{\"code\":1000,\"description\":\"Success\"},\"data\":{\"userId\":\"001400000000000000000023420506\",\"userStatus\":\"P\",\"cardId\":\"2559101200129\",\"cardType\":\"P1\",\"countryCode\":null,\"userType\":\"21\",\"segment\":null,\"titleTH\":\"???\",\"nameTH\":\"????????????\",\"middleNameTH\":\"\",\"lastNameTH\":\"????????\",\"titleEN\":\"MR.\",\"nameEN\":\"CITIZENXIII\",\"middleNameEN\":\"\",\"lastNameEN\":\"ONLY\",\"email\":null,\"registerDate\":\"2017-01-04T00:00:00.000-0500\",\"tcAcceptDate\":\"2017-02-13\",\"promptpayTcAcceptDate\":null,\"tcAcceptVersion\":2,\"promptpayTcAcceptVersion\":null,\"language\":\"en\",\"maskAccountFlag\":1,\"profilePhotoPath\":\"/media/images/7990cc76ea6f49a29bd8626b1b73da3c\",\"mobileNo\":\"0915556666\",\"buzzebeeBaseURL\":\"https://fasteasy.scbeasy.com:8463/buzzebees/home.aspx?hash=\",\"emailNotificationFlag\":\"0\",\"bulkActivateDate\":null,\"mutualFundTcAcceptDate\":null,\"mutualFundTcAcceptVersion\":0}}",headers, HttpStatus.OK);
    return stringResponseEntity;
  }
  @RequestMapping(value = "/v3/profiles/tiles", method = RequestMethod.GET)
  public ResponseEntity<String> tiles() {
    return new ResponseEntity<>("{\"status\":{\"code\":1000,\"description\":\"Success\"},\"data\":{\"rootMaxNumberOfTiles\":5,\"groupMaxNumberOfTiles\":9,\"tiles\":[{\"parentTileId\":0,\"tileId\":1,\"sortSequence\":2,\"tileType\":\"GROUP\",\"tileSubType\":\"FAVOURITE\",\"tileNameEn\":\"Pay family & friends\",\"tileNameTh\":\"บัญชีครอบครัว และเพื่อน\",\"tileNickName\":null,\"tileDeletableFlag\":\"0\",\"tileDragableFlag\":\"1\",\"imageURL\":\"/lifestyle/tilebackground/familyfriends.png\",\"data\":null},{\"parentTileId\":0,\"tileId\":16,\"sortSequence\":3,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"QUICKPROMPTPAY\",\"tileNameEn\":\"PromptPay\",\"tileNameTh\":\"โอนผ่านพร้อมเพย์\",\"tileNickName\":null,\"tileDeletableFlag\":\"1\",\"tileDragableFlag\":\"1\",\"imageURL\":\"/lifestyle/tilebackground/quickpromptpay.png\",\"data\":null},{\"parentTileId\":0,\"tileId\":17,\"sortSequence\":4,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"QUICKBALANCE\",\"tileNameEn\":\"Quick balance\",\"tileNameTh\":\"เช็คยอดทันใจ\",\"tileNickName\":null,\"tileDeletableFlag\":\"1\",\"tileDragableFlag\":\"1\",\"imageURL\":\"/lifestyle/tilebackground/quickbalance.png\",\"data\":null}]}}", HttpStatus.OK);
  }
  @RequestMapping(value = "/isprint/soap/preAuth", method = RequestMethod.POST)
  public ResponseEntity<String> preAuth() {
    return new ResponseEntity<>("{\n" +
      "\"status\" : \n" +
      "  {\n" +
      "    \"statuscode\" : \"0\",\n" +
      "    \"statusdesc\" : \"success\"\n" +
      "    }\n" +
      ",\n" +
      "\"e2ee\" : {\n" +
      "\"oaepHashAlgo\" : \"SHA1\",\n" +
      "\"pubKeyIndex\" : 3,\n" +
      "\"e2eeSid\" : \"0001LFovmUMmi5IKLCfvvKrhFshFREWxp1-KeI1X7gA7jXN6rD6t0QN05rjBPCpHgpwbwCAvmAtdpuJ7x37RPwEiZSQ\",\n" +
      "\"serverRandom\" : \"EB03C42284B740E893F5DD9D0FB02C81\",\n" +
      "\"pubKey\" : \"BB82E25CF6F1005B97EA3047D50B79F229CB93C4D3FEF255F659FB06B4661919D06BA30C7DDE5D9633D012839FC98A0EF520C951D2738706198D698361999FE325606572A0099F148BBCA2462829ACE127174999F94DD2F27F360ED6594F1D555D05795568B2F7B91FB47B8A45A075775FF23D18ECF4E21078170277AD1CECB9D64F9A23657EB034FB695516DECD3A7D5EED287F70660B683BB8906E9ED21EB5D09792B191E1AF65F71DF035BB4C5B0501AC9C23F3CB6E9F24999639A5EB4CD6C2C5D2A24BD18647D951FA3D92BF50EF5BE8F5F709134F65FDC635289AAF968DD225DC2D73960D703DACCD99D6ACE2AA97D8CE9484F3AED463A1CE17AA7FFC13,00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000009147,1945538D59C3BE6C\"}\n" +
      "}", HttpStatus.OK);
  }

}