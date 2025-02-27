package ru.points.fitapp.domain.use_case_impl

import ru.points.fitapp.data.entity.Exercise
import ru.points.fitapp.data.repository.irepository.ExerciseRepository
import ru.points.fitapp.domain.use_case_interface.InsertExerciseUseCase

class InsertExerciseUseCaseImpl(
    private val exerciseRepository: ExerciseRepository
) : InsertExerciseUseCase {
    override fun handle(title: String, weight: Float?) {
        exerciseRepository.insertExercise(
            exercise = Exercise(title = title, weight = weight)
        )
    }
}