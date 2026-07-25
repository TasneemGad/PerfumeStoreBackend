package com.PerfumeStore.PerfumeStore.shared.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@MappedSuperclass
@Data
@EqualsAndHashCode(of = { "arabicName", "englishName" }, callSuper = true)
@ToString(of = { "arabicName", "englishName", "enabled" }, callSuper = true)
public class LookupEntity extends BaseEntity {
  @Column(length = 255)
  private String arabicName;

  @Column(length = 255)
  private String englishName;

  @Column
  private String code;

  @Column(name = "is_enabled")
  private Boolean enabled;
}
