package org.knowm.xchange.huobi.dto.trade.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.huobi.dto.HuobiResult;
import org.knowm.xchange.huobi.dto.trade.HuobiTrade;

public class HuobiTradeResult extends HuobiResult<HuobiTrade[]> {

  public HuobiTradeResult(
      @JsonProperty("status") String status,
      @JsonProperty("err-code") String errCode,
      @JsonProperty("err-msg") String errMsg,
      @JsonProperty("data") HuobiTrade[] result) {
    super(status, errCode, errMsg, result);
  }
}
