package ua.kpi.controller;

import java.util.List;
import lombok.Setter;
import ua.kpi.entities.Commodity;
import ua.kpi.services.CommodityService;
import ua.kpi.view.View;

@Setter
public class Controller {

  private CommodityService commodityService;
  private View view;

  public void processUser() {
    List<Commodity> all = commodityService.findAll();
    view.print(all.toString());

  }

}
