package org.knowm.xchange.huobi.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

public class HuobiTrade {

  private final long id;
  private final long ts;
  private final HuobiTradeRecord[] data;

  public HuobiTrade(
      @JsonProperty("id") long id,
      @JsonProperty("ts") long ts,
      @JsonProperty("data") HuobiTradeRecord[] data) {
    super();
    this.id = id;
    this.ts = ts;
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public long getTs() {
    return ts;
  }

  public HuobiTradeRecord[] getData() {
    return data;
  }

  @Override
  public String toString() {
    return String.format("HuobiTrade [id = %s, ts = %s, data = %s", id, ts, Arrays.toString(data));
  }
}
