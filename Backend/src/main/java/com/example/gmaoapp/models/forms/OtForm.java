package com.example.gmaoapp.models.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtForm {
    private String type;
    private List<ReclamationForm> reclamationList;
    private List<Long> listeIntervenantId;
    private String descriptionOt;
}
