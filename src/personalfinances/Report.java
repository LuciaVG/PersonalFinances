/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalfinances;

/**
 *
 * @author skullgsus
 */
public interface Report {
    public abstract String createReport(Calculator calculations,Format format);
}
