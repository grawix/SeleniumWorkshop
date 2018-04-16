package Pages;

import Pages.Common.FooterPage;
import Pages.Common.HeaderPage;

public class BaseContentPage extends BasePage {
    public FooterPage footer;
    public HeaderPage header;

    public BaseContentPage(){
        super();
        footer = new FooterPage();
        header = new HeaderPage();
    }
}
