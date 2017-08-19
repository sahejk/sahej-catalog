package hello.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

  @RequestMapping(value = "/v3/login/preloadcheck", method = RequestMethod.POST)
  public ResponseEntity<String> login() {
    return new ResponseEntity<>("{\"status\":{\"code\":1000,\"description\":\"Success\"},\"data\":{\"language\":\"en\",\"tcAcceptVersion\":2,\"titleTH\":\"???\",\"nameTH\":\"????????????\",\"middleNameTH\":\"\",\"lastNameTH\":\"????????\",\"titleEN\":\"MR.\",\"nameEN\":\"CITIZENXIII\",\"middleNameEN\":\"\",\"lastNameEN\":\"ONLY\",\"profilePhotoPath\":\"/media/images/7990cc76ea6f49a29bd8626b1b73da3c\",\"staticTiles\":[{\"tileId\":901,\"sortSequence\":1,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"WEBVIEW\",\"tileNameEN\":\"Easy Bonus\",\"tileNameTH\":\"สิทธิพิเศษอีซี่โบนัส\",\"imageURL\":\"/lifestyle/partner/1.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"L\",\"tileFontColor\":\"FakeWhite\",\"data\":{\"URL\":\"http://fasteasy.scbeasy.com:8463/buzzebees/home.aspx?hash=8D1019BEDC017F840E91E24A4D12BFDBD8D667D5AE49A78F20B73FBA803F95D8\"}},{\"tileId\":902,\"sortSequence\":2,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"WEBVIEW\",\"tileNameEN\":\"Card deals\",\"tileNameTH\":\"โปรโมชั่นบัตร\",\"imageURL\":\"/lifestyle/partner/2.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"S\",\"tileFontColor\":\"FakeWhite\",\"data\":{\"URL\":\"https://scbprime.scb.co.th/th/promotion-creditcard\"}},{\"tileId\":903,\"sortSequence\":3,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"WEBVIEW\",\"tileNameEN\":\"Dining\",\"tileNameTH\":\"ค้นหาร้านอร่อย\",\"imageURL\":\"/lifestyle/partner/3.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"M\",\"tileFontColor\":\"FakeWhite\",\"data\":{\"URL\":\"https://pdev.wongnai.com/l/scb-easy\"}},{\"tileId\":904,\"sortSequence\":4,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"FUNCTION\",\"tileNameEN\":\"Register PromptPay\",\"tileNameTH\":\"สมัครพร้อมเพย์\",\"imageURL\":\"/lifestyle/partner/4.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"L\",\"tileFontColor\":\"FakeBlack\",\"data\":{\"functionId\":\"2\"}},{\"tileId\":905,\"sortSequence\":5,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"FUNCTION\",\"tileNameEN\":\"Donation\",\"tileNameTH\":\"บริจาค\",\"imageURL\":\"/lifestyle/partner/5.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"M\",\"tileFontColor\":\"FakeBlack\",\"data\":{\"functionId\":\"10\"}},{\"tileId\":906,\"sortSequence\":6,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"FUNCTION\",\"tileNameEN\":\"Contact us\",\"tileNameTH\":\"ติดต่อเรา\",\"imageURL\":\"/lifestyle/partner/6.png\",\"tileNickName\":\"null\",\"tileDeletableFlag\":0,\"tileDragableFlag\":0,\"tileSize\":\"S\",\"tileFontColor\":\"FakeWhite\",\"data\":{\"functionId\":\"11\"}}],\"versionAvailable\":{\"android\":\"3.0.1/165\",\"iOS\":\"3.4.7/315\",\"androidUrl\":\"https://play.google.com/store/apps/details?id=com.scb.phone&hl=th\",\"iOSUrl\":\"https://itunes.apple.com/th/app/scb-easy/id568388474?mt=8\"}}}", HttpStatus.OK);
  }
  @RequestMapping(value = "/v3/profiles/tiles", method = RequestMethod.POST)
  public ResponseEntity<String> tiles() {
    return new ResponseEntity<>("{\"status\":{\"code\":1000,\"description\":\"Success\"},\"data\":{\"rootMaxNumberOfTiles\":5,\"groupMaxNumberOfTiles\":9,\"tiles\":[{\"parentTileId\":0,\"tileId\":1,\"sortSequence\":2,\"tileType\":\"GROUP\",\"tileSubType\":\"FAVOURITE\",\"tileNameEn\":\"Pay family & friends\",\"tileNameTh\":\"บัญชีครอบครัว และเพื่อน\",\"tileNickName\":null,\"tileDeletableFlag\":\"0\",\"tileDragableFlag\":\"1\",\"imageURL\":\"/lifestyle/tilebackground/familyfriends.png\",\"data\":null},{\"parentTileId\":0,\"tileId\":16,\"sortSequence\":3,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"QUICKPROMPTPAY\",\"tileNameEn\":\"PromptPay\",\"tileNameTh\":\"โอนผ่านพร้อมเพย์\",\"tileNickName\":null,\"tileDeletableFlag\":\"1\",\"tileDragableFlag\":\"1\",\"imageURL\":\"/lifestyle/tilebackground/quickpromptpay.png\",\"data\":null},{\"parentTileId\":0,\"tileId\":17,\"sortSequence\":4,\"tileType\":\"SHORTCUT\",\"tileSubType\":\"QUICKBALANCE\",\"tileNameEn\":\"Quick balance\",\"tileNameTh\":\"เช็คยอดทันใจ\",\"tileNickName\":null,\"tileDeletableFlag\":\"1\",\"tileDragableFlag\":\"1\",\"imageURL\":\"/lifestyle/tilebackground/quickbalance.png\",\"data\":null}]}}", HttpStatus.OK);
  }

}