package com.example.input_object_type.type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Generated("Apollo GraphQL")
public final class ReviewInput {
  private final int stars;

  private final @Nullable Integer nullableIntFieldWithDefaultValue;

  private final @Nullable String commentary;

  private final @Nonnull ColorInput favoriteColor;

  private final @Nullable Episode enumWithDefaultValue;

  private final @Nullable Episode nullableEnum;

  private final @Nullable List<Date> listOfCustomScalar;

  private final @Nullable List<Episode> listOfEnums;

  ReviewInput(int stars, @Nullable Integer nullableIntFieldWithDefaultValue,
      @Nullable String commentary, @Nonnull ColorInput favoriteColor,
      @Nullable Episode enumWithDefaultValue, @Nullable Episode nullableEnum,
      @Nullable List<Date> listOfCustomScalar, @Nullable List<Episode> listOfEnums) {
    this.stars = stars;
    this.nullableIntFieldWithDefaultValue = nullableIntFieldWithDefaultValue;
    this.commentary = commentary;
    this.favoriteColor = favoriteColor;
    this.enumWithDefaultValue = enumWithDefaultValue;
    this.nullableEnum = nullableEnum;
    this.listOfCustomScalar = listOfCustomScalar;
    this.listOfEnums = listOfEnums;
  }

  /**
   * 0-5 stars
   */
  public int stars() {
    return this.stars;
  }

  /**
   * for test purpose only
   */
  public @Nullable Integer nullableIntFieldWithDefaultValue() {
    return this.nullableIntFieldWithDefaultValue;
  }

  /**
   * Comment about the movie, optional
   */
  public @Nullable String commentary() {
    return this.commentary;
  }

  /**
   * Favorite color, optional
   */
  public @Nonnull ColorInput favoriteColor() {
    return this.favoriteColor;
  }

  /**
   * for test purpose only
   */
  public @Nullable Episode enumWithDefaultValue() {
    return this.enumWithDefaultValue;
  }

  /**
   * for test purpose only
   */
  public @Nullable Episode nullableEnum() {
    return this.nullableEnum;
  }

  /**
   * for test purpose only
   */
  public @Nullable List<Date> listOfCustomScalar() {
    return this.listOfCustomScalar;
  }

  /**
   * for test purpose only
   */
  public @Nullable List<Episode> listOfEnums() {
    return this.listOfEnums;
  }

  public static Builder builder() {
    return new Builder();
  }

  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        writer.writeInt("stars", stars);
        writer.writeInt("nullableIntFieldWithDefaultValue", nullableIntFieldWithDefaultValue);
        writer.writeString("commentary", commentary);
        writer.writeObject("favoriteColor", favoriteColor.marshaller());
        writer.writeString("enumWithDefaultValue", enumWithDefaultValue != null ? enumWithDefaultValue.name() : null);
        writer.writeString("nullableEnum", nullableEnum != null ? nullableEnum.name() : null);
        writer.writeList("listOfCustomScalar", listOfCustomScalar != null ? new InputFieldWriter.ListWriter() {
          @Override
          public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
            for (Date $item : listOfCustomScalar) {
              listItemWriter.writeCustom(CustomType.DATE, $item);
            }
          }
        } : null);
        writer.writeList("listOfEnums", listOfEnums != null ? new InputFieldWriter.ListWriter() {
          @Override
          public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
            for (Episode $item : listOfEnums) {
              listItemWriter.writeString($item.name());
            }
          }
        } : null);
      }
    };
  }

  public static final class Builder {
    private int stars;

    private @Nullable Integer nullableIntFieldWithDefaultValue = 10;

    private @Nullable String commentary;

    private @Nonnull ColorInput favoriteColor;

    private @Nullable Episode enumWithDefaultValue = Episode.JEDI;

    private @Nullable Episode nullableEnum;

    private @Nullable List<Date> listOfCustomScalar;

    private @Nullable List<Episode> listOfEnums;

    Builder() {
    }

    /**
     * 0-5 stars
     */
    public Builder stars(int stars) {
      this.stars = stars;
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder nullableIntFieldWithDefaultValue(@Nullable Integer nullableIntFieldWithDefaultValue) {
      this.nullableIntFieldWithDefaultValue = nullableIntFieldWithDefaultValue;
      return this;
    }

    /**
     * Comment about the movie, optional
     */
    public Builder commentary(@Nullable String commentary) {
      this.commentary = commentary;
      return this;
    }

    /**
     * Favorite color, optional
     */
    public Builder favoriteColor(@Nonnull ColorInput favoriteColor) {
      this.favoriteColor = favoriteColor;
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder enumWithDefaultValue(@Nullable Episode enumWithDefaultValue) {
      this.enumWithDefaultValue = enumWithDefaultValue;
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder nullableEnum(@Nullable Episode nullableEnum) {
      this.nullableEnum = nullableEnum;
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfCustomScalar(@Nullable List<Date> listOfCustomScalar) {
      this.listOfCustomScalar = listOfCustomScalar;
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder listOfEnums(@Nullable List<Episode> listOfEnums) {
      this.listOfEnums = listOfEnums;
      return this;
    }

    public ReviewInput build() {
      Utils.checkNotNull(favoriteColor, "favoriteColor == null");
      return new ReviewInput(stars, nullableIntFieldWithDefaultValue, commentary, favoriteColor, enumWithDefaultValue, nullableEnum, listOfCustomScalar, listOfEnums);
    }
  }
}
