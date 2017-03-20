package com.example.picimaci.mobilsoft_lab3;

import com.example.picimaci.mobilsoft_lab3.ui.UIModule;
import com.example.picimaci.mobilsoft_lab3.ui.main.MainActivity;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {UIModule.class})
public interface MobSoftApplicationComponent {
    void inject(MainActivity mainActivity);

}