package org.knowm.xchange.huobi.dto.trade;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

public class HuobiTradeRecord {

  private BigDecimal id;
  private BigDecimal amount;
  private BigDecimal price;
  private String direction;
  private long ts;

  public HuobiTradeRecord(
      @JsonProperty("id") BigDecimal id,
      @JsonProperty("amount") BigDecimal amount,
      @JsonProperty("price") BigDecimal price,
      @JsonProperty("direction") String direction,
      @JsonProperty("ts") long ts) {
    super();
    this.id = id;
    this.amount = amount;
    this.price = price;
    this.direction = direction;
    this.ts = ts;
  }

  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public long getTs() {
    return ts;
  }

  public void setTs(long ts) {
    this.ts = ts;
  }

  @Override
  public String toString() {
    return String.format(
        "[id = %s, amount = %s, price = %s, direction = %s, ts ) %s]",
        id, amount, price, direction, ts);
  }
}
