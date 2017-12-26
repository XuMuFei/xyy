/*
 * Create by Gemini Y on 16-12-15 下午2:13
 * Copyright (c) 2016. All right reserved.
 *
 * Last modified 16-12-15 下午2:13
 */

package com.ebnews.uc.bean;

import java.io.Serializable;

/**
 * The type Token bean.
 *
 * @description:
 * @author: xuyangyang
 * @email: xuyangyang @ebrun.com
 * @version: V1.0.0
 * @create: 2017 /11/30 10:36
 * @modify:
 */
public class Pojo implements Serializable {

    /**
     * token_type : Bearer
     * expires_in : 1296000
     * access_token : eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjA2ZTAxNjgwYTkyN2M5OTRhZmU5ZTkzNmQ5YjQ3NWQ5Y2I1YjhmMjZjMjQ4NzNkZDFkYTk0MGYyMDEzN2NlMGM5N2E1MGZiZDBmNjg3NTZmIn0.eyJhdWQiOiIyIiwianRpIjoiMDZlMDE2ODBhOTI3Yzk5NGFmZTllOTM2ZDliNDc1ZDljYjViOGYyNmMyNDg3M2RkMWRhOTQwZjIwMTM3Y2UwYzk3YTUwZmJkMGY2ODc1NmYiLCJpYXQiOjE0ODE2OTEyOTUsIm5iZiI6MTQ4MTY5MTI5NSwiZXhwIjoxNDgyOTg3Mjk1LCJzdWIiOiIzODgzNSIsInNjb3BlcyI6WyIqIl19.dIwSi-L2VXGG9wqphhI5qxqwVDqKqdAAmEtRGSyrU9QP_z7IlTEZYgNsuU1k3dkD8EYxbot9kas2nVNgdJGdTIc-sVccsDMW3hejvDEZh2WmAn--y39GpcgCL5G_u55OJP-YpDnwubVvvvRIYSUAfjGyAlGUjYWHJPJJsKSuRfRToasCBmmhtnTkALD4wToKm2fpnlrDp0xOOhEMiREYHXXT_qfftI8Cu629OdXiAyhnKv43OrlyxjVpIofMKaGBu6rYx7zwg6-GQTrcYOzD0DeZeifHT2m4aa_VzAv7G3EfPhMURzxSAxeRKRgdvLRfSyPcx-Tj7sbJukYP3yWk73Lxs0de72myDIDw1wJ-detG7uCwhRbqkHUOJIzjPO0dSYiuwlSYoCpITQeiDWV3Gm1y2tpQawJnvVeEJ-3o2r5toqxWiuFTW_5wXglCTu_m-qCFJeoY9eSTFGcXuE6aXuWb3qu0jmtkdGfG3N-nW66nDVyC4o7mlDYxNFqteF_zO6J868pO9Qa9cJ1Slce8bVF8BsFZd8-uciYTS-wlXEfi-GCz0siHeVBWYvvRD1aWDXUt0Z-EFlE7dgyLwYdNZBw4-nns06rTLqDsDPSewgTRi15pLssn1TJYQ4mDkh-EwA68HbPncgt-h3uUIqj91MA3EjlC5_Sv2dTxKVYpP8c
     * refresh_token : gz+6GFhHjxJCUtMApRQgdavm1VJZ4RmvYnFw4Ypg2D5CZiucVInYkGkXJNQVKyIObuyK+n9dRRj5SZHPLge1Duexb6Qj8YKdiSPU1eVnxojFAgHOHsZZCFo/GR55GCc5hYNhwaMJ6YB0MNgdpx+5sqkILMBDMDeozwNznmeTApfGUvKPg87z4uQ7p/cMhXGb2TUv0expiDltSO7gieqRosW03blFBbTcjtTcv3I7Bt8qWD9PxNExa8HJQTV+ZSXJ72prb/4TYnzA/LPuOnpgqRQ6cUc1m65iDEg1aWIu2mUioz8DdPYt3Kwq6uSL6DMslWgMKfkn7qjBp0CknCMYDMHvohwrUO9asZYqpnsuxjV1+sIRG084ujTvpNxxyuJbX2DGF9NW6OtMmtSPPVrX956rfzA7CvXcRrToDvmyfUA1hXQCXy6a2a6gKU0YiQ6TE+UTwXr14hHvGSy5hcD7BWs2R2Iyepank6cqfPJVu+b2k1j0/gVd9bjX7EQwqleIuOAaJNkecfBwykfRgZSSq7GQ9uk5dbAHOsMApXSDbZElxxw6XDhrYS8gGbpO4YC3gcA28sriLlYNratA9G9kdE6IqwdjM3UAMh0Uo9h98B/G0xrPa+3xC3EOtJ6nGNzwSxFoASKOjneNq/p6zJ46M2uzm1cOc82KTY+zOZA4Ko4=
     */

    private String token_type;
    private int expires_in;
    private String access_token;
    private String refresh_token;

    /**
     * Gets token type.
     *
     * @return the token type
     */
    public String getToken_type() {
        return token_type;
    }

    /**
     * Sets token type.
     *
     * @param token_type
     *         the token type
     */
    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    /**
     * Gets expires in.
     *
     * @return the expires in
     */
    public int getExpires_in() {
        return expires_in;
    }

    /**
     * Sets expires in.
     *
     * @param expires_in
     *         the expires in
     */
    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    /**
     * Gets access token.
     *
     * @return the access token
     */
    public String getAccess_token() {
        return access_token;
    }

    /**
     * Sets access token.
     *
     * @param access_token
     *         the access token
     */
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    /**
     * Gets refresh token.
     *
     * @return the refresh token
     */
    public String getRefresh_token() {
        return refresh_token;
    }

    /**
     * Sets refresh token.
     *
     * @param refresh_token
     *         the refresh token
     */
    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }


    @Override
    public String toString() {
        return "TokenBean{" +
                "token_type='" + token_type + '\'' +
                ", expires_in=" + expires_in +
                ", access_token='" + access_token + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                '}';
    }
}
